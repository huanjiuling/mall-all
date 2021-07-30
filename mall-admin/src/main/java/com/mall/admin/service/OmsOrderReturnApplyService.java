package com.mall.admin.service;

import com.mall.admin.dto.OmsOrderReturnApplyResult;
import com.mall.admin.dto.OmsReturnApplyQueryParam;
import com.mall.admin.dto.OmsUpdateStatusParam;
import com.mall.mbg.model.OmsOrderReturnApply;
import java.util.List;

public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
