package com.springboot.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.cache.RedisCacheHelper;
import com.springboot.demo.entity.User;
import com.springboot.demo.mapper.UserMapper;
import com.springboot.demo.service.UserService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /*
     * redis
     * @author Reich
     * @date 2019/3/28
     */
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisCacheHelper redisCacheHelper;

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

//        String userKey = "user:" + id;
//        User user = (User) redisCacheHelper.get(userKey,User.class);
//        if (user == null){
//            user = userMapper.selectById(id);
//            redisCacheHelper.set(userKey, user, 1000);
//        }
//        return user;

        //使用redisCacheHelper工具类
        String userkey = "user:" + id;
        User user = (User) redisCacheHelper.get(userkey, User.class);
        if (user == null){
            user = userMapper.selectById(id);
            redisCacheHelper.set(userkey, user, 1000);
            return user;
        }
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
