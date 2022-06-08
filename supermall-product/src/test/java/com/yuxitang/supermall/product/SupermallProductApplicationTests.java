package com.yuxitang.supermall.product;


import com.yuxitang.supermall.product.entity.BrandEntity;
import com.yuxitang.supermall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class SupermallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Apple");
        brandService.save(brandEntity);
        System.out.println("save ");
    }

}
