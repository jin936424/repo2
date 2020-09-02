package com.jwh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jwh.mapper")
public class SpringbootinterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootinterceptorApplication.class, args);
    }

}
