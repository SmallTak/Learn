package com.yunfei.vuecrudproduct.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunfei.vuecrudproduct.entity.Product;
import com.yunfei.vuecrudproduct.entity.ProductExample;
import com.yunfei.vuecrudproduct.mapper.ProductMapper;
import com.yunfei.vuecrudproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageInfo<Product> selectAllProduct(Integer pageNo) {
        PageHelper.startPage(pageNo,9);
        List<Product> products = productMapper.selectByExample(new ProductExample());
        return new PageInfo<>(products);
    }

    @Override
    public List<Product> selectAllProduct() {
        List<Product> products = productMapper.selectByExample(new ProductExample());
        return products;
    }

    @Override
    public void saveProduct(Product product) {

        productMapper.insertSelective(product);

    }
}
