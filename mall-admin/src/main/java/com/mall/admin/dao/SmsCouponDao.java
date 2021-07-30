package com.mall.admin.dao;

import com.mall.admin.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponDao {
    SmsCouponParam getItem(@Param("id") Long id);
}
