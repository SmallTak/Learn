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

    /*  根据id删除商品
     *
     * @date 2019/4/26
     * @param [id]
     * @return void
     */
    void delProductById(Integer id);

    /*  根据id查找商品
     *
     * @date 2019/4/26
     * @param [id]
     * @return com.yunfei.vuecrudproduct.entity.Product
     */
    Product findProductById(Integer id);

    /*  根据id修改商品
     *
     * @date 2019/4/26
     * @param [id]
     * @return void
     */
    void editProductById(Product product);

    /*  批量删除
     *
     * @date 2019/4/29
     * @param [arr]  
     * @return void  
     */ 
    void bathDelById(String arr);
}
