package com.yunfei.vuecrudproduct.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunfei.vuecrudproduct.entity.Product;
import com.yunfei.vuecrudproduct.entity.ProductExample;
import com.yunfei.vuecrudproduct.entity.TAccount;
import com.yunfei.vuecrudproduct.entity.TAccountExample;
import com.yunfei.vuecrudproduct.mapper.ProductMapper;
import com.yunfei.vuecrudproduct.mapper.TAccountMapper;
import com.yunfei.vuecrudproduct.service.ProductService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private TAccountMapper accountMapper;

    @Override
    public PageInfo<Product> selectAllProduct(Integer pageNo) {
        PageHelper.startPage(pageNo,10);
        ProductExample productExample = new ProductExample();
        //productExample.setOrderByClause("id DESC");
        List<Product> products = productMapper.selectByExample(productExample);
        return new PageInfo<>(products);
    }

    @Override
    public List<Product> selectAllProduct() {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andIdBetween(2194,2210);
        List<Product> products = productMapper.selectByExample(productExample);
        return products;
    }


    @Override
    public void saveProduct(Product product) {

        productMapper.insertSelective(product);

    }

    @Override
    public void delProductById(Integer id) {

        Product product = productMapper.selectByPrimaryKey(id);
        if (product == null){
            throw new RuntimeException("未查到给商品");
        }
        productMapper.deleteByPrimaryKey(id);

    }

    @Override
    public Product findProductById(Integer id) {
        Product product = productMapper.selectByPrimaryKey(id);
        return product;
    }

    @Override
    public void editProductById(Product product) {

        productMapper.updateByPrimaryKeySelective(product);

    }

    @Override
    public void bathDelById(String arr) {
        String[] split = StringUtils.split(arr, "{\"test\":},");
        for (String s : split) {
            productMapper.deleteByPrimaryKey(Integer.valueOf(s));
        }
    }
}
