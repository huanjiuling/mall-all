package com.mall.admin.dto;

import com.mall.mbg.model.SmsFlashPromotionSession;
import lombok.Getter;
import lombok.Setter;

public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Setter
    @Getter
    private Long productCount;
}
