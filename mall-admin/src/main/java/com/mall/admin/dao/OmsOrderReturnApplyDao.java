package com.mall.admin.dao;

import com.mall.admin.dto.OmsOrderReturnApplyResult;
import com.mall.admin.dto.OmsReturnApplyQueryParam;
import com.mall.mbg.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
