package com.yuxitang.supermall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuxitang.common.utils.PageUtils;
import com.yuxitang.supermall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-08 00:00:49
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

