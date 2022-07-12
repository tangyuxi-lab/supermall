package com.yuxitang.supermall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuxitang.common.utils.PageUtils;
import com.yuxitang.supermall.product.entity.AttrAttrgroupRelationEntity;
import com.yuxitang.supermall.product.vo.AttrGroupRelationVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-07 21:23:13
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveBatch(List<AttrGroupRelationVo> vos);
}

