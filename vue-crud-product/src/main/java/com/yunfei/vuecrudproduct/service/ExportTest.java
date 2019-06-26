package com.yunfei.vuecrudproduct.service;

import com.yunfei.vuecrudproduct.entity.TAccount;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface ExportTest {

    public void exportTest(List<TAccount> list, HttpServletResponse response) throws IOException;

}
