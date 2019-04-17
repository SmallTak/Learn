package com.springboot.dm.task;

import com.springboot.dm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;

@Component
public class MyTask {

    @Autowired
    private LogService logService;

    @Scheduled(cron = "* * 8,9,10,11,12,13,14,15,16,17,18 ? * MON-FRI")
    public void reportCurrentTime() throws ParseException {
        System.out.println("开始执行任务");
        logService.insert();

    }

}
