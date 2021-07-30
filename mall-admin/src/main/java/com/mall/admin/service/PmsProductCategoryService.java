package com.mall.admin.service;

import com.mall.admin.dto.PmsProductCategoryParam;
import com.mall.admin.dto.PmsProductCategoryWithChildrenItem;
import com.mall.mbg.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface PmsProductCategoryService {
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    int delete(Long id);

    PmsProductCategory getItem(Long id);

    int updateNavStatus(List<Long> ids, Integer navStatus);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
