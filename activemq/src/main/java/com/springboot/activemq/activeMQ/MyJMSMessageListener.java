package com.springboot.activemq.activeMQ;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyJMSMessageListener {

    @JmsListener(destination = "springboot-queue")
    public void queueListener(String message){

        System.out.println("queue listner + " + message);

    }

}
