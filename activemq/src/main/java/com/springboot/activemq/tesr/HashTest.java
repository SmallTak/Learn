package com.springboot.activemq.tesr;

import org.junit.Test;

import java.util.HashMap;
import java.util.Objects;

public class HashTest {

    private Integer id;

    public Integer get(){
        return id;
    }

    public HashTest(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashTest hashTest = (HashTest) o;
        return Objects.equals(id, hashTest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }




}
