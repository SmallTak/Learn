package com.yunfei.vuecrudproduct.service.impl;

import com.yunfei.vuecrudproduct.entity.Account;
import com.yunfei.vuecrudproduct.entity.AccountExample;
import com.yunfei.vuecrudproduct.mapper.AccountMapper;
import com.yunfei.vuecrudproduct.service.AccountService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account login(String userName, String password) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andUserNameEqualTo(userName);
        List<Account> tAccounts = accountMapper.selectByExample(accountExample);
        System.err.println(tAccounts.toString()+ DigestUtils.md5Hex(password));
        Account account = tAccounts != null && !tAccounts.isEmpty() ? tAccounts.get(0) : null;
        if(account == null) {
            throw new RuntimeException("账号或密码错误");
        } else {
            if( DigestUtils.md5Hex(password).equals(account.getPassword())) {
                return account;
            } else {
                throw new RuntimeException("账号或密码错误");
            }
        }
    }

    @Override
    public Account findAccountById(Integer accountId) {
        Account account = accountMapper.selectByPrimaryKey(accountId);
        return account;
    }

    @Override
    public List<Account> findAccountAll() {
        return accountMapper.selectByExample(new AccountExample());
    }

}
