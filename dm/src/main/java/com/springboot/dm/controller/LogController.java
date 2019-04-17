package com.springboot.dm.controller;


import com.springboot.dm.service.LogService;
import com.springboot.dm.service.impl.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping
    public String home(){
        try {
            logService.insert();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "success";
    }


}
