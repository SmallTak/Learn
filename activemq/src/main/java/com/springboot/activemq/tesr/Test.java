package com.springboot.activemq.tesr;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;

public class Test {

    @org.junit.Test
    public void  test(){
        HashTest h1 = new HashTest(1);
        HashTest h2 = new HashTest(1);
        HashMap<HashTest, String> hm = new HashMap<HashTest, String>();
        hm.put(h1, "Key with id is 1");
        hm.put(h2, "Keywithidis 2");
        System.out.println(hm.get(h1).hashCode());
        System.out.println(hm.get(h2).hashCode());
        System.out.println(hm.get(h1).equals(h2));

    }

}
