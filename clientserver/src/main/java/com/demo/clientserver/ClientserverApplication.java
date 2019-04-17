package com.demo.clientserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.demo.clientserver.mapper")
@SpringBootApplication
public class ClientserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientserverApplication.class, args);
    }

}
