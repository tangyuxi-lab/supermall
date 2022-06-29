package com.yuxitang.supermall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SupermallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermallThirdPartyApplication.class, args);
    }

}
