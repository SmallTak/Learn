package com.springboot.sendemail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mail")
public class EmailController {

    @GetMapping
    public String home(){
        return "success";
    }

}
