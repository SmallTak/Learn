package com.demo.clientserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.clientserver.entity.User;
import com.demo.clientserver.utils.HttpService;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;

import static com.demo.clientserver.utils.HttpService.getData;

@Controller
@RequestMapping("/home")
public class TestService {

    @ResponseBody
    @GetMapping
    public String home(){
        String data = null;
        try {
            data = HttpService.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data);

        //将调用的接收到的json转为list
        List<User> userList = JSON.parseArray(data, User.class);
        userList.stream().forEach(System.err::println);

        return userList.toString();
    }

}
