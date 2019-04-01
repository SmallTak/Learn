package com.springboot.activemq.controller;

import com.springboot.activemq.activeMQ.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiveMQController {

    @Autowired
    private SendMessage sendMessage;

    @GetMapping
    public String home(){

        sendMessage.sendMessageToQueue("hi MQ + " + System.currentTimeMillis());
        return "send success";
    }

}
