package com.mall.admin.dao;

import com.mall.admin.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;

public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
