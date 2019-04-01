package com.springboot.activemq.controller;

import com.springboot.activemq.activeMQ.SendMessage;
import com.springboot.activemq.entity.User;
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

    @GetMapping("/topic")
    public String topic(){
        sendMessage.sendMeaageToTopic("hey + MQ + " + System.currentTimeMillis());
        return "send success";
    }

    /*发送java对象
     *
     * @author Reich
     * @date 2019/4/1
     */
    @GetMapping("/user")
    public String user(){

        sendMessage.sendUser();
        return "send user success";
    }

}
