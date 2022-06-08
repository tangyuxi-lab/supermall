package com.yuxitang.supermall.order.dao;

import com.yuxitang.supermall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-08 00:27:47
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
