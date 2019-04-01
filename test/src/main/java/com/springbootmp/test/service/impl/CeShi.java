package com.springbootmp.test.service.impl;

import com.springbootmp.test.service.Other;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CeShi {

    @Autowired
    @Qualifier("OtherImpl2")
    private Other other;

    @Test
    public void home(){

        other.test();

    }


}
