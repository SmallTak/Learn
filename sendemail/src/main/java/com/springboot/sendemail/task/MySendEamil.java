package com.springboot.sendemail.task;

import com.springboot.sendemail.utils.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySendEamil {

    @Autowired
    private EmailUtil util;

    @Scheduled(cron = "0 */10 * * * ?")
    public void sendEamil(){
        System.out.println("开始发送~~" + System.currentTimeMillis());
        util.sendSimpleMail("1048388981@qq.com", "hey","hi");

    }

    @Scheduled(cron = "0 */10 * * * ?")
    public void sendEamil1(){
        System.out.println("开始发送~~" + System.currentTimeMillis());
        util.sendSimpleMail("hdysimple@163.com", "hey","hi");

    }

}
