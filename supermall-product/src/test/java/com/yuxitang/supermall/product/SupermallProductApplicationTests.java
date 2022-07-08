package com.yuxitang.supermall.product;

import com.yuxitang.supermall.product.entity.BrandEntity;
import com.yuxitang.supermall.product.service.BrandService;
import com.yuxitang.supermall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.util.logging.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;


@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class SupermallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    @Test
    public void testFindPath(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径, {}", Arrays.asList(catelogPath));
    }
    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Apple");
        brandService.save(brandEntity);
        System.out.println("save ");
    }

}
