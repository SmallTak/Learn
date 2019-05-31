package com.interfac.text.demo.controller;

import com.interfac.text.demo.controller.exception.NotFountException;
import com.interfac.text.demo.controller.result.ResponseBean;
import com.interfac.text.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/inter")
public class HomeController {

    @Autowired
    private SearchService searchService;

    @GetMapping
    public String Home(){
        return "product/new";
    }

    @GetMapping("/{userNc}")
    @ResponseBody
    public ResponseBean Search(@PathVariable String userNc){

        try {
            searchService.findUserByNameAndCard(userNc);
            return ResponseBean.success();
        }catch (RuntimeException e){
            return ResponseBean.error(e.getMessage());
        }
    }

}
