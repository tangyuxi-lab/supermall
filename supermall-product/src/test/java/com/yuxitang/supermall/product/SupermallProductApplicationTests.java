package com.yuxitang.supermall.product;


import com.aliyun.oss.*;
import com.yuxitang.supermall.product.entity.BrandEntity;
import com.yuxitang.supermall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


@SpringBootTest

@RunWith(SpringRunner.class)
public class SupermallProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Apple");
        brandService.save(brandEntity);
        System.out.println("save ");
    }

}
