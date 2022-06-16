package com.yuxitang.supermall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yuxitang.supermall.coupon.dao")
public class SupermallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermallCouponApplication.class, args);
    }

}
