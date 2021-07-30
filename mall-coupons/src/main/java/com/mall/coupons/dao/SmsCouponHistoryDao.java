package com.mall.coupons.dao;

import com.mall.coupons.domain.SmsCouponHistoryDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface SmsCouponHistoryDao {
    List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Long memberId);
}
