package com.yuxitang.supermall.order.dao;

import com.yuxitang.supermall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-08 00:27:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
