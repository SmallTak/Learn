package com.kaishengit.controller;

import com.kaishengit.entity.Account;
import com.kaishengit.mapper.AccountMapper;
import com.kaishengit.service.AccountService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public String Login(HttpServletRequest req, HttpServletResponse resp){

        Cookie[] cookies = req.getCookies();
        String md5Password = DigestUtils.md5Hex(123123 + "QWSXZA$%$%((^%^FDEW))123");
        System.err.print(md5Password);
        for(Cookie cookie : cookies) {
            if (cookie == null || StringUtils.isEmpty("")){
                System.err.print("say!!!" + cookie.getValue().toString() + "say!!!");
            }
            if("cookieValue".equals(cookie.getName())) {
                req.setAttribute("cookieValue", cookie.getValue());
                System.err.println("hey" + cookie.getValue() + "hey");
                System.err.println("he" + cookie.getName() + "he");


            }
        }

        return "account/login";

    }


    @PostMapping("/login")
    public String login(HttpServletRequest request , HttpServletResponse response, String mobile, String password, String remember){

        Account account = accountService.findByMobile(mobile, password);

        HttpSession session = request.getSession();
        session.setAttribute("account", account);

        if(StringUtils.isNotEmpty(remember)) {
            Cookie cookie = new Cookie("cookieValue",mobile);
            cookie.setDomain("localhost");
            cookie.setPath("/");
            cookie.setMaxAge(60 * 60 * 24 * 30);
            cookie.setHttpOnly(true);

            response.addCookie(cookie);
        } else {
            Cookie[] cookies = request.getCookies();
            for(Cookie cookie : cookies) {
                if("cookieValue".equals(cookie.getName())) {
                    cookie.setDomain("localhost");
                    cookie.setPath("/");
                    cookie.setMaxAge(0);

                    response.addCookie(cookie);
                }
            }
        }


        String md5Password = DigestUtils.md5Hex(password + "QWSXZA$%$%((^%^FDEW))123");
        System.err.print(md5Password);
        if (account != null && md5Password.equals(account.getPassword())){
            return "redirect:/product";
        }
        return "account/login";
    }

}
