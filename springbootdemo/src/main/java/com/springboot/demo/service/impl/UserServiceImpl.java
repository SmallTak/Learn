package com.springboot.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.entity.User;
import com.springboot.demo.mapper.UserMapper;
import com.springboot.demo.service.UserService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /*
     * 查找所用用户
     * @author Reich
     * @date 2019/3/27
     */
    @Override
    public List<User> findAllUser() {

        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
        return userList;
    }

    @Override
    public User selectById(Integer id) {

        User user = userMapper.selectById(id);
        return user;

    }


    /*
     * MyBatis plus + PageInfo
     * @author Reich
     * @date 2019/3/27
     */
    @Override
    public PageInfo<User> findAllUserPage(Integer pageNo) {
        PageHelper.startPage(pageNo,2);
        return new PageInfo<>(userMapper.selectList(null));
    }


}
