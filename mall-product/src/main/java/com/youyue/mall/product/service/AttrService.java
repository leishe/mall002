package com.youyue.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youyue.common.utils.PageUtils;
import com.youyue.mall.product.entity.AttrEntity;
import com.youyue.mall.product.vo.AttrGroupRelationVo;
import com.youyue.mall.product.vo.AttrRespVo;
import com.youyue.mall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

}

