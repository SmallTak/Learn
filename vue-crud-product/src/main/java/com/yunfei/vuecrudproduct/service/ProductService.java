package com.yunfei.vuecrudproduct.service;

import com.github.pagehelper.PageInfo;
import com.yunfei.vuecrudproduct.entity.Product;

import java.util.List;

public interface ProductService {
    /*
     * 查找所有商品
     * @date 2019/4/26
     * @param []
     * @return com.github.pagehelper.PageInfo<com.yunfei.vuecrudproduct.entity.Product>
     */
    PageInfo<Product> selectAllProduct(Integer pageNo);

    /*
     *
     * @date 2019/4/26
     * @param []
     * @return com.github.pagehelper.PageInfo<com.yunfei.vuecrudproduct.entity.Product>
     */
    List<Product> selectAllProduct();

    /*  添加商品
     *
     * @date 2019/4/26
     * @param [product]
     * @return void
     */
    void saveProduct(Product product);
}
