package com.demo.clientserver.service.impl;

import com.demo.clientserver.entity.User;
import com.demo.clientserver.mapper.UserMapper;
import com.demo.clientserver.service.UserService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllData() {
        List<User> userList = userMapper.selectList(null);
        return userList;
    }
}
