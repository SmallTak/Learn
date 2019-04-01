package com.springbootmp.test.service.impl;

import com.springbootmp.test.entity.User;
import com.springbootmp.test.mapper.UserMapper;
import com.springbootmp.test.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void test(){

        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);

        User user = userMapper.selectById("1");
        user.getName();
        System.out.println(user.toString());

    }


}
