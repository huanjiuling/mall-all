package com.mall.admin.dao;

import com.mall.mbg.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface PmsProductFullReductionDao {
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
