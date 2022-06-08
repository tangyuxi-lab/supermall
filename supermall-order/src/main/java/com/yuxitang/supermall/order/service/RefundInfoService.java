package com.yuxitang.supermall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuxitang.common.utils.PageUtils;
import com.yuxitang.supermall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-08 00:27:47
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
