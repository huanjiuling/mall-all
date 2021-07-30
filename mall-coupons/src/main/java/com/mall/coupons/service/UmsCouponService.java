package com.mall.coupons.service;

import com.mall.common.api.CommonResult;
import com.mall.coupons.domain.CartPromotionItem;
import com.mall.coupons.domain.SmsCouponHistoryDetail;
import com.mall.mbg.model.SmsCouponHistory;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface UmsCouponService {

    @Transactional
    CommonResult add(Long couponId, Long memberId, String nickName);

    List<SmsCouponHistory> list(Integer useStatus, Long memberId);

    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type, Long memberId);
}
