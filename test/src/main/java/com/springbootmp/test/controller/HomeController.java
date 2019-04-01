package com.springbootmp.test.controller;


import com.springbootmp.test.service.LicensingService;
import com.springbootmp.test.service.Other;
import com.springbootmp.test.service.UserService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private LicensingService licensingService;

    @Autowired
    @Qualifier("OtherImpl2")
    private Other other;

    @GetMapping
    @ResponseBody
    public String home1(){

        //licensingService.update();
        return "hey";

    }

//    @GetMapping
//    @ResponseBody
//    public String home(){
//        userService.test();
//
//        return "hey";
//    }


}
