package com.youyue.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youyue.mall.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
