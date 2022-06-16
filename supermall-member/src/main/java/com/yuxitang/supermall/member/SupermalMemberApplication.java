package com.yuxitang.supermall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SupermalMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermalMemberApplication.class, args);
    }

}
