package com.mall.admin.dao;

import com.mall.mbg.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface PmsMemberPriceDao {
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
