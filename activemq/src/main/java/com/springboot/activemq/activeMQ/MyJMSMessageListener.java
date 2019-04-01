package com.springboot.activemq.activeMQ;

import com.springboot.activemq.entity.User;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class MyJMSMessageListener {

    /*监听队列的user对象
     *
     * @author Reich
     * @date 2019/4/1user
     */
    @JmsListener(destination = "user-queue")
    public void getUserFromMq(User user){
        System.out.println("user" + user);
    }


    /*监听器默认监听的是队列，监听不到主题的
     *
     * @author Reich
     * @date 2019/4/1
     */
    @JmsListener(destination = "springboot-queue")
    public void queueListener(TextMessage message){


        try {
            System.out.println("queue listner + " + message.getText());
            message.acknowledge();//如果不接收的话，默认会调用重试机制
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    @JmsListener(destination = "springboot-topic", containerFactory = "topicjmsListenerContainerFactory")
    public void topicListener(String message){
        System.out.println("topic listener " + message);
    }

}
