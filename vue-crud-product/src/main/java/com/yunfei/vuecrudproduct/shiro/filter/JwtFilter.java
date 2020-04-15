package com.yunfei.vuecrudproduct.shiro.filter;

import com.yunfei.vuecrudproduct.shiro.token.JwtToken;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class JwtFilter extends AccessControlFilter {

    //请求头中的token所在的key
    private static final String  AUTHORIZATION_HEADER = "Authorization";

    protected static Logger logger=LoggerFactory.getLogger(JwtFilter.class);

    //因为前端使用的是axios，涉及到跨域的问题，用户端第一次发送的是OPTIONS请求，因为所有的请求都是要经过过滤器的，所以我们下面解决的就是跨域问题
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        System.err.println("----------------------------------Origin-filter----------------------------------");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-control-Allow-Origin",httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods","GET,POST,OPTIONS,PUT,DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
       // httpServletResponse.setHeader("Access-Control-Allow-Credentials","true");
        // 跨域时会首先发送一个option请求，这里给option请求直接返回正常状态
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }

    /*  添加拦截器，获得请求头中的token
     *
     * @date 2019/6/25
     * @param [servletRequest, servletResponse, o]  
     * @return boolean  
     */ 
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //从请求中获得token
        String token = request.getHeader(AUTHORIZATION_HEADER);
        System.err.println("----------------------------------start-filter----------------------------------");

        if (StringUtils.isEmpty(token)){
            loginError(servletResponse, "请登录后再执行该操作");
            logger.debug("请登录后再执行该操作");
        } else {
            JwtToken jwtToken = new JwtToken(token);  //因为jwtToken实现了AuthenticationToken，所以realm验证登录的时候直接可以获得token
            Subject subject = getSubject(servletRequest, servletResponse);
            try {
                subject.login(jwtToken);
                return true;
            } catch (AuthenticationException e) {
                e.printStackTrace();
                loginError(servletResponse,e.getMessage());
            }
        }
        return false;
    }

    /*  验证失败
     *
     * @date 2019/6/25
     * @param [servletResponse, message]
     * @return void
     */
    private void loginError(ServletResponse servletResponse, String message) throws IOException {

        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.sendError(401,message);
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }
}
