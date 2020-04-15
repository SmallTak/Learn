package com.yunfei.vuecrudproduct.service;

import com.yunfei.vuecrudproduct.entity.Account;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface ExportTest {

    public void exportTest(List<Account> list, HttpServletResponse response) throws IOException;

}
