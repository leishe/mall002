package com.youyue.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youyue.common.utils.PageUtils;
import com.youyue.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);


}

