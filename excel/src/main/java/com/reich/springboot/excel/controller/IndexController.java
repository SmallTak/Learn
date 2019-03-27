package com.reich.springboot.excel.controller;

import com.reich.springboot.excel.userService.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/test")
public class IndexController {

    @Autowired
    private ITestService testService;

    @GetMapping
    public  String home(){
        return "upload";
    }

    @PostMapping("/import")
    @ResponseBody
    public boolean addUser(@RequestParam("file") MultipartFile file) {
        boolean a = false;
        String fileName = file.getOriginalFilename();
        try {
            a = testService.batchImport(fileName, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  a;
    }
}
