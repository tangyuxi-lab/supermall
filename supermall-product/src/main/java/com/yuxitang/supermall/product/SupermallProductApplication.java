package com.yuxitang.supermall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.yuxitang.supermall.product.dao")
public class SupermallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermallProductApplication.class, args);
    }

}
