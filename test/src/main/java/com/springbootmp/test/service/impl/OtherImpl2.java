package com.springbootmp.test.service.impl;

import com.springbootmp.test.service.Other;
import org.springframework.stereotype.Service;

@Service("OtherImpl2")
public class OtherImpl2 implements Other {

    public void test(){

        System.out.println("hey man ~");

    }

}
