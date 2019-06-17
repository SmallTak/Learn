package com.yunfei.vuecrudproduct;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class VueCrudProductApplicationTests {

    @Test
    public void contextLoads() {

        String psd = DigestUtils.md5Hex("123123");
        System.out.println(psd);

    }

}
