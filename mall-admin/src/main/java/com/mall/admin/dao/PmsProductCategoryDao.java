package com.mall.admin.dao;

import com.mall.admin.dto.PmsProductCategoryWithChildrenItem;
import java.util.List;

public interface PmsProductCategoryDao {
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
