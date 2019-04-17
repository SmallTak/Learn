package com.demo.clientserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.demo.clientserver.entity.User;
import com.demo.clientserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/test")
public class HomeController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/home")
    public String home(HttpServletRequest request){
        String value = request.getHeader("key");
        System.out.println(value);
        if (value != null && value.equals("123")){
            List<User> users = userService.selectAllData();

            return JSONArray.toJSONString(users);
        }
        return "Error";
        //return value == "123" ? "yes" : "NO";
    }


}
