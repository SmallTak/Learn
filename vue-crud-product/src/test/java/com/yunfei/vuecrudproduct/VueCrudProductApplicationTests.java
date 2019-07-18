//package com.yunfei.vuecrudproduct;
//import	java.util.List;
//import	java.beans.Visibility;
//
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.JWTVerifier;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.exceptions.JWTVerificationException;
//import com.auth0.jwt.exceptions.TokenExpiredException;
//import com.yunfei.vuecrudproduct.util.JwtUtil;
//import org.apache.commons.codec.digest.DigestUtils;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.UnsupportedEncodingException;
//
//
//public class VueCrudProductApplicationTests {
//
//    @Test
//    public void contextLoads() {
//
//        String psd = DigestUtils.md5Hex("123123");
//        //System.out.println(psd);
//        String token = "J0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJleHAiOjE1NjQwNDE2NjIsInVzZXJJZCI6MX0.Kksq-In8PeL5OVaoo2WAOvcCU0qrZISAbnCDPMZ4iZfFp3YSs8E1B85Ehoq4zpks";
//        try {
//            Algorithm algorithm = Algorithm.HMAC384("4297f44b13955235245b2497399d7a93");
//            JWTVerifier jwtVerifier = JWT.require(algorithm).withClaim("userId", 1).build();
//            jwtVerifier.verify(token);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//            throw new RuntimeException("token 不合法",e);
//        } catch (TokenExpiredException e) {
//            e.printStackTrace();
//            throw new RuntimeException("token 已过期",e);
//        } catch (JWTVerificationException e) {
//            e.printStackTrace();
//            throw new RuntimeException("token 不合法",e);
//        }
//
//    }
//
//    @Test
//    public void test(){
//        JwtUtil jwtUtil = new JwtUtil();
//        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJleHAiOjE1NjQwNDYwNzQsInVzZXJJZCI6MX0.o-QOr6bufcLeCpJc0Eli0-jxHxnJ3q8DwjaB96L-0Us1z1VTT8hGlWC29Ka6Lp3j";
//        jwtUtil.verifyToken(token, "4297f44b13955235245b2497399d7a93",1);
//        System.out.println("ok");
//    }
//
//    @Test
//    public void te(){
//        JwtUtil jwtUtil = new JwtUtil();
//        String token = jwtUtil.createToken(1, "4297f44b13955235245b2497399d7a93");
//        System.out.println(token);
//    }
//
//
//}
