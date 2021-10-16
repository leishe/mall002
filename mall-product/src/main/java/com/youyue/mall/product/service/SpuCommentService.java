package com.youyue.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youyue.common.utils.PageUtils;
import com.youyue.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

