package com.youyue.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youyue.common.utils.PageUtils;
import com.youyue.mall.product.entity.AttrAttrgroupRelationEntity;
import com.youyue.mall.product.vo.AttrGroupRelationVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveBatch(List<AttrGroupRelationVo> vos);

}

