package com.yunfei.vuecrudproduct.shiro.realm;

import com.yunfei.vuecrudproduct.entity.TAccount;
import com.yunfei.vuecrudproduct.service.AccountService;
import com.yunfei.vuecrudproduct.shiro.token.JwtToken;
import com.yunfei.vuecrudproduct.util.JwtUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtRealm extends AuthorizingRealm {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AccountService accountService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /*  验证权限和角色
     *
     * @date 2019/6/25
     * @param [principalCollection]
     * @return org.apache.shiro.authz.AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /*  验证登录
     *
     * @date 2019/6/25
     * @param [authenticationToken]
     * @return org.apache.shiro.authc.AuthenticationInfo
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        JwtToken jwtToken = (JwtToken) authenticationToken;
        //从jwttoken中取出token
        String token = (String) jwtToken.getPrincipal();

        //根据token取出id
        Integer accountId = jwtUtil.getUserIdFromToken(token);

        TAccount account = accountService.findAccountById(accountId);
        if (account == null){
            throw new UnknownAccountException("该token不存在");
        }else {
            try {
                jwtUtil.verifyToken(token,account.getPassword(),accountId);
            }catch (Exception e){
                //e.printStackTrace();
                //throw new AuthenticationException(e.getMessage(), e);
                throw new UnknownAccountException("token已过期，请重新登录");
            }
        }
        return new SimpleAuthenticationInfo(token, token, getName());
    }


}
