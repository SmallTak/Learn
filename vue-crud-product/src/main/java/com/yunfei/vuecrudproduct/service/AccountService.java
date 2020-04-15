package com.yunfei.vuecrudproduct.service;

import com.yunfei.vuecrudproduct.entity.Account;

import java.util.List;

public interface AccountService {

    /*  登录
     *
     * @date 2019/6/17
     * @param [userName, password]  
     * @return com.yunfei.vuecrudproduct.entity.TAccount  
     */ 
    Account login(String userName, String password);

    /*  根据id查找account
     *
     * @date 2019/6/25
     * @param [accountId]  
     * @return org.apache.shiro.authc.Account  
     */ 
    Account findAccountById(Integer accountId);

    /*  查找所有account
     *
     * @date 2019/6/26
     * @param []
     * @return java.util.List<com.yunfei.vuecrudproduct.entity.TAccount>
     */
    List<Account> findAccountAll();
}
