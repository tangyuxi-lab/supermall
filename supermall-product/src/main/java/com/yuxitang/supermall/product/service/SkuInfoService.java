package com.yuxitang.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuxitang.common.utils.PageUtils;
import com.yuxitang.supermall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-07 21:23:13
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

