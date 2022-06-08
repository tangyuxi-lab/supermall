package com.yuxitang.supermall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuxitang.common.utils.PageUtils;
import com.yuxitang.supermall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yuxitang
 * @email yuxitang@vt.edu
 * @date 2022-06-08 00:43:31
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

