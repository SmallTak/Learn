package com.springboot.dm.service.impl;

import com.springboot.dm.entity.SysSysauditlog;
import com.springboot.dm.mapper.SysSysauditlogMapper;
import com.springboot.dm.service.LogService;
import com.springboot.dm.util.RandomIp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class LogServiceImpl implements LogService {

    private static final Logger logger = LoggerFactory.getLogger(LogServiceImpl.class);

    @Value("spring.datasource.url")
    private String url;


    @Autowired
    private SysSysauditlogMapper sysSysauditlogMapper;

    private static final int USER_ID = 0;
    private static final String USER_NAME = "访客";
    private static final String HANDLEFLAG = "浏览";
    private static final String ALIAS = "成功";
    private static final int FLAG = 0;
    private static final int BTYPE = 1;

    @Override
    public void insert() throws ParseException {

        List list = new ArrayList();
        list.add(0,"首页");
        list.add(1,"信用动态");
        list.add(2,"信用研究");
        list.add(3,"政策法规");
        list.add(4,"信用服务");
        list.add(5,"行业信用");
        list.add(6,"信用公示");
        list.add(7,"专项治理");
        list.add(8,"联合奖惩");
        list.add(9,"信用研究");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String str = sdf.format(new Date());
        Date parse = sdf.parse(str);

        SysSysauditlog sysSysauditlog = new SysSysauditlog();

            sysSysauditlog.setUserid(USER_ID);
            sysSysauditlog.setUsername(USER_NAME);
            sysSysauditlog.setHandleflag(HANDLEFLAG);
            sysSysauditlog.setAlias(ALIAS);
            sysSysauditlog.setFlag(FLAG);
            sysSysauditlog.setBtype(BTYPE);
            sysSysauditlog.setSysdate(parse);
            sysSysauditlog.setIp(RandomIp.getRandomIp());
            //int iRandom = (int) (1 + Math.random()*10);
            sysSysauditlog.setHandlename((String) list.get(new Random().nextInt(list.size())));
            sysSysauditlogMapper.insert(sysSysauditlog);
            logger.info("插入log {}",sysSysauditlog);
            System.out.println(url);



    }

}
