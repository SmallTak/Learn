package com.yunfei.vuecrudproduct.controller;

import com.yunfei.vuecrudproduct.controller.resoult.ResponseBean;
import com.yunfei.vuecrudproduct.entity.TAccount;
import com.yunfei.vuecrudproduct.service.AccountService;
import com.yunfei.vuecrudproduct.service.ExportTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/exportExcel")
@CrossOrigin("*")
public class ExportExcel {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ExportTest exportTest;

    @GetMapping
    @ResponseBody
    public ResponseBean export(HttpServletResponse response){
       // System.err.println(page);
        List<TAccount> accounts = accountService.findAccountAll();
        try {
            exportTest.exportTest(accounts, response);
            return ResponseBean.success();
        } catch (IOException e) {
            return ResponseBean.error(e.getMessage());
        }

    }

}
