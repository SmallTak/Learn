package com.yunfei.vuecrudproduct.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Date;

@Component
public class JwtUtil {

    public static final long TOKEN_EXPIRES = 1000 * 60 * 60 * 24 * 30L;

    /*  创建token
     *
     * @date 2019/6/17
     * @param [userId, password]  
     * @return java.lang.String  
     */ 
    public String createToken(Integer userId, String password){

        //使用密码作为密钥
        try {
            Algorithm algorithm = Algorithm.HMAC384(password);
            return JWT.create().withClaim("userId", userId)
                    .withExpiresAt(new Date(System.currentTimeMillis() + TOKEN_EXPIRES))
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException("创建token异常",e);
        }
    }

   /*  从token中获得账号的id
    *
    * @date 2019/6/17
    * @param [token]  
    * @return java.lang.Integer  
    */ 
    public Integer getUserIdFromToken(String token){
        DecodedJWT decodedJWT = JWT.decode(token);
        return decodedJWT.getClaim("userId").asInt();
    }

    /*  校验token
     *
     * @date 2019/6/17
     * @param [token, password, userId]
     * @return void
     */
    public void verifyToken(String token, String password, Integer userId){

        try {
            Algorithm algorithm = Algorithm.HMAC384(password);
            JWTVerifier jwtVerifier = JWT.require(algorithm).withClaim("userId", userId).build();
            jwtVerifier.verify(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException("token 不合法",e);
        } catch (TokenExpiredException e) {
            e.printStackTrace();
            throw new RuntimeException("token 已过期",e);
        } catch (JWTVerificationException e) {
            e.printStackTrace();
            throw new RuntimeException("token 不合法",e);
        }
    }
}
