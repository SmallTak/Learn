package com.yunfei.vuecrudproduct.controller;


import com.github.pagehelper.PageInfo;
import com.yunfei.vuecrudproduct.controller.resoult.ResponseBean;
import com.yunfei.vuecrudproduct.entity.Product;
import com.yunfei.vuecrudproduct.service.AccountService;
import com.yunfei.vuecrudproduct.service.ExportTest;
import com.yunfei.vuecrudproduct.service.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class HomeController {

    @Autowired
    private ProductService productService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private ExportTest exportTest;

    @ApiOperation("/home页面")
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

    @ApiOperation("/新增商品")
    @PostMapping("/new")
    public ResponseBean addProduct(@RequestBody Product product){//@RequestBody若前端发送的数据为json则加

        productService.saveProduct(product);
        System.err.println(product.toString());
        return ResponseBean.success();
    }

    @ApiOperation("/批量删除")
    @DeleteMapping("/bathDel")
    public ResponseBean bathDel(@RequestBody String arr){//@PathVariable Integer[] attr

        productService.bathDelById(arr);
        return ResponseBean.success();
    }

    @ApiOperation("/单个删除商品")
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

    @ApiOperation("/通过id查找商品")
    @GetMapping("/{id}")
    public ResponseBean findProductById(@PathVariable Integer id){

        Product product = productService.findProductById(id);
        return ResponseBean.success(product);

    }

    @ApiOperation("/通过id修改商品")
    @PutMapping("/{id}")
    public ResponseBean editProductById(@RequestBody Product product){

        System.err.print(product);
        productService.editProductById(product);
        return ResponseBean.success();
    }


}
