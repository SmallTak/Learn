package com.yunfei.vuecrudproduct.controller;


import com.yunfei.vuecrudproduct.controller.resoult.ResponseBean;
import com.yunfei.vuecrudproduct.entity.Product;
import com.yunfei.vuecrudproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class HomeController {

    @Autowired
    private ProductService productService;

//    @GetMapping
//    public ResponseBean  home(@RequestParam(required = false, name = "p", defaultValue = "1") Integer pageNo){
//
//        PageInfo<Product> pageInfo =  productService.selectAllProduct(pageNo);
//        return ResponseBean.success(pageInfo);
//
//    }
    @GetMapping
    public ResponseBean home(){
        List<Product> products =  productService.selectAllProduct();
        return ResponseBean.success(products);
    }

    @PostMapping("/new")
    public ResponseBean addProduct(@RequestBody Product product){//@RequestBody若前端发送的数据为json则加

        productService.saveProduct(product);
        System.err.println(product.toString());
        return ResponseBean.success();

    }


}
