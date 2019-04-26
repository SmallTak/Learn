package com.yunfei.vuecrudproduct.controller;


import com.github.pagehelper.PageInfo;
import com.yunfei.vuecrudproduct.controller.resoult.ResponseBean;
import com.yunfei.vuecrudproduct.entity.Product;
import com.yunfei.vuecrudproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

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

//    private CorsConfiguration buildConfig() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        //  你需要跨域的地址  注意这里的 127.0.0.1 != localhost
//        // * 表示对所有的地址都可以访问
//        corsConfiguration.addAllowedOrigin("http://localhost:8080");
//        //  跨域的请求头
//        corsConfiguration.addAllowedHeader("*"); // 2
//        //  跨域的请求方法
//        corsConfiguration.addAllowedMethod("*"); // 3
//        //加上了这一句，大致意思是可以携带 cookie
//        //最终的结果是可以 在跨域请求的时候获取同一个 session
//        corsConfiguration.setAllowCredentials(true);
//        return corsConfiguration;
//    }
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        //配置 可以访问的地址
//        source.registerCorsConfiguration("/**", buildConfig()); // 4
//        return new CorsFilter(source);
//    }


}
