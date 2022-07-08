package com.yuxitang.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuxitang.common.utils.PageUtils;
import com.yuxitang.supermall.product.entity.AttrEntity;
import com.yuxitang.supermall.product.vo.AttrRespVo;
import com.yuxitang.supermall.product.vo.AttrVo;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-07 21:23:13
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);
}

