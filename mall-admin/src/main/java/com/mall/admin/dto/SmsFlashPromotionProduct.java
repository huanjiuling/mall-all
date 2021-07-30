package com.mall.admin.dto;

import com.mall.mbg.model.PmsProduct;
import com.mall.mbg.model.SmsFlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    private PmsProduct product;
}
