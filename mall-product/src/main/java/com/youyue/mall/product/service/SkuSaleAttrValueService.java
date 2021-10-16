package com.youyue.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youyue.common.utils.PageUtils;
import com.youyue.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

