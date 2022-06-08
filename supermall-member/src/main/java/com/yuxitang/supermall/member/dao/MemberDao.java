package com.yuxitang.supermall.member.dao;

import com.yuxitang.supermall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-08 00:11:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
