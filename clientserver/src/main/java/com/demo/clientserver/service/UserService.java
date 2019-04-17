package com.demo.clientserver.service;

import com.demo.clientserver.entity.User;

import java.util.List;

public interface UserService {
    /*
     * 查找所有用户
     *
     * @author Reich
     * @date 2019/4/17
     */
    List<User> selectAllData();

}
