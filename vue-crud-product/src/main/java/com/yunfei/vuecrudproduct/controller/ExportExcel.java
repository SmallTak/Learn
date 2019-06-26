package com.yunfei.vuecrudproduct.controller;

import com.yunfei.vuecrudproduct.entity.TAccount;
import com.yunfei.vuecrudproduct.service.AccountService;
import com.yunfei.vuecrudproduct.service.ExportTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController("/exportExcel")
public class ExportExcel {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ExportTest exportTest;

    @GetMapping
    public void export(HttpServletResponse response){

        List<TAccount> accounts = accountService.findAccountAll();
        try {
            exportTest.exportTest(accounts, response);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
