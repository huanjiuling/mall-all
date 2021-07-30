package com.mall.admin.service;

import com.mall.admin.dto.PmsProductAttributeCategoryItem;
import com.mall.mbg.model.PmsProductAttributeCategory;
import java.util.List;

public interface PmsProductAttributeCategoryService {
    int create(String name);

    int update(Long id, String name);

    int delete(Long id);

    PmsProductAttributeCategory getItem(Long id);

    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
