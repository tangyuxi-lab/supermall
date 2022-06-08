package com.yuxitang.supermall.coupon.dao;

import com.yuxitang.supermall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-08 00:00:49
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
