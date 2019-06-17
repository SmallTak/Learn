package com.yunfei.vuecrudproduct.controller;

import com.yunfei.vuecrudproduct.controller.resoult.ResponseBean;
import com.yunfei.vuecrudproduct.entity.TAccount;
import com.yunfei.vuecrudproduct.service.AccountService;
import com.yunfei.vuecrudproduct.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseBean login(@RequestBody  TAccount accoun){

        try {
            System.out.println(accoun.getUsername() + accoun.getPassword());
            TAccount account = accountService.login(accoun.getUsername(), accoun.getPassword());
            String token = jwtUtil.createToken(account.getId(),account.getPassword());
            return ResponseBean.success(token);
        } catch (Exception e){
            return ResponseBean.error(e.getMessage());
        }


    }

}
