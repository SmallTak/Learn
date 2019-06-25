package com.yunfei.vuecrudproduct.service;

import com.yunfei.vuecrudproduct.entity.TAccount;

public interface AccountService {

    /*  登录
     *
     * @date 2019/6/17
     * @param [userName, password]  
     * @return com.yunfei.vuecrudproduct.entity.TAccount  
     */ 
    TAccount login(String userName, String password);

    /*  根据id查找account
     *
     * @date 2019/6/25
     * @param [accountId]  
     * @return org.apache.shiro.authc.Account  
     */ 
    TAccount findAccountById(Integer accountId);
}
