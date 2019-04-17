package com.demo.clientserver.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.clientserver.entity.User;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class test {

    @Test
    public void home() throws IOException {

        String data = HttpService.getData();
        System.out.println(data);

        //将调用的接收到的json转为list
        List<User> userList = JSON.parseArray(data, User.class);
        userList.stream().forEach(System.err::println);
        System.out.println(userList.toString());

    }

}
