package com.springboot.activemq.activeMQ;

import com.springboot.activemq.entity.User;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Component
public class SendMessage {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessageToQueue(String message){

        System.out.println(message);
        ActiveMQQueue activeMQQueue = new ActiveMQQueue("springboot-queue");
        jmsTemplate.send(activeMQQueue, session -> session.createTextMessage(message));

//        ActiveMQQueue activeMQQueue = new ActiveMQQueue("springbott-queue");
//        jmsTemplate.send(activeMQQueue, new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                return session.createTextMessage("hey springboot+ActiveMQ");
//            }
//        });

    }

    public void sendMeaageToTopic(String message){
        ActiveMQTopic activeMQTopic = new ActiveMQTopic("springboot-topic");
        jmsTemplate.send(activeMQTopic, session -> session.createTextMessage(message));
    }


    public void sendUser() {

        User user = new User();
        user.setAge("22");
        user.setUserName("yunfeiyang");

        ActiveMQQueue activeMQQueue = new ActiveMQQueue("user-queue");
        jmsTemplate.convertAndSend(activeMQQueue, user);

    }

}
