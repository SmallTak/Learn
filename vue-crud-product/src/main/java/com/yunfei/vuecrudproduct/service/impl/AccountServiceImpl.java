package com.yunfei.vuecrudproduct.service.impl;

import com.yunfei.vuecrudproduct.entity.TAccount;
import com.yunfei.vuecrudproduct.entity.TAccountExample;
import com.yunfei.vuecrudproduct.mapper.TAccountMapper;
import com.yunfei.vuecrudproduct.service.AccountService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private TAccountMapper accountMapper;

    @Override
    public TAccount login(String userName, String password) {
        TAccountExample accountExample = new TAccountExample();
        accountExample.createCriteria().andUsernameEqualTo(userName);
        List<TAccount> tAccounts = accountMapper.selectByExample(accountExample);
        TAccount account = tAccounts != null && !tAccounts.isEmpty() ? tAccounts.get(0) : null;
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
    public TAccount findAccountById(Integer accountId) {
        TAccount account = accountMapper.selectByPrimaryKey(accountId);

        return account;
    }

}
