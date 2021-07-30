package com.mall.admin.dao;

import com.mall.admin.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface PmsProductAttributeDao {
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
