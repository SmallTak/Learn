package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.entity.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class HomeController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> home(Model model){

        List<User> users = userService.findAllUser();
        model.addAttribute("users", users);
        return users;

    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        User user = userService.selectById(id);
        return user;

    }

    @GetMapping("/page")
    public PageInfo<User> hey(@RequestParam(required = false, defaultValue = "1", name = "p") Integer pageNo){
        return userService.findAllUserPage(pageNo);
    }




}
