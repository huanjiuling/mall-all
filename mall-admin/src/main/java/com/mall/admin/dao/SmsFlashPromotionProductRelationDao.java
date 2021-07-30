package com.mall.admin.dao;

import com.mall.admin.dto.SmsFlashPromotionProduct;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface SmsFlashPromotionProductRelationDao {
    /**
     * 获取限时购及相关商品信息
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
