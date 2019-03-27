package com.springboot.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.entity.User;

import java.util.List;

public interface UserService {

    //void test();

    List<User> findAllUser();

    User selectById(Integer id);


    PageInfo<User> findAllUserPage(Integer pageNo);
}
