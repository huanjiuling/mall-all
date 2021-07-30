package com.mall.admin.dao;

import com.mall.admin.dto.PmsProductAttributeCategoryItem;
import java.util.List;

public interface PmsProductAttributeCategoryDao {
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
