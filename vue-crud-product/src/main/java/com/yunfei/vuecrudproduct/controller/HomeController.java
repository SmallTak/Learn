package com.yunfei.vuecrudproduct.controller;


import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.yunfei.vuecrudproduct.controller.para.MyParam;
import com.yunfei.vuecrudproduct.controller.resoult.ResponseBean;
import com.yunfei.vuecrudproduct.entity.Product;
import com.yunfei.vuecrudproduct.service.ProductService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseBean  home(@RequestParam(required = false, name = "p", defaultValue = "1") Integer pageNo){

        PageInfo<Product> pageInfo =  productService.selectAllProduct(pageNo);
        return ResponseBean.success(pageInfo);

    }
//    @GetMapping
//    public ResponseBean home(){
//        List<Product> products =  productService.selectAllProduct();
//        return ResponseBean.success(products);
//    }

    @PostMapping("/new")
    public ResponseBean addProduct(@RequestBody Product product){//@RequestBody若前端发送的数据为json则加

        productService.saveProduct(product);
        System.err.println(product.toString());
        return ResponseBean.success();
    }

    @DeleteMapping("/bathDel")
    public ResponseBean bathDel(@RequestBody String arr){//@PathVariable Integer[] attr

        productService.bathDelById(arr);
        return ResponseBean.success();
    }

    @DeleteMapping("/{id}")
    public ResponseBean delProductById(@PathVariable Integer id){
        try {
            System.err.print(id);
            productService.delProductById(id);
            return ResponseBean.success();
        } catch (RuntimeException e){
            System.err.print(e.getMessage());
            return ResponseBean.error(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseBean findProductById(@PathVariable Integer id){

        Product product = productService.findProductById(id);
        return ResponseBean.success(product);

    }

    @PutMapping("/{id}")
    public ResponseBean editProductById(@RequestBody Product product){

        System.err.print(product);
        productService.editProductById(product);
        return ResponseBean.success();
    }


}
