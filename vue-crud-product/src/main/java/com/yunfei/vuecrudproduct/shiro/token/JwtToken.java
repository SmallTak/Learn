package com.yunfei.vuecrudproduct.shiro.token;

import org.apache.shiro.authc.AuthenticationToken;

/*  shiro中的jwttoken
 *
 * @date 2019/6/25
 * @param
 * @return
 */
public class JwtToken implements AuthenticationToken  {

    private String token;
    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
