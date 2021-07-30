package com.mall.admin.dao;

import com.mall.mbg.model.PmsSkuStock;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface PmsSkuStockDao {
    /**
     * 批量插入操作
     */
    int insertList(@Param("list")List<PmsSkuStock> skuStockList);

    /**
     * 批量插入或替换操作
     */
    int replaceList(@Param("list")List<PmsSkuStock> skuStockList);
}
