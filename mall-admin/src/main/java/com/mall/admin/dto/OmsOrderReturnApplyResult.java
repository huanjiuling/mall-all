package com.mall.admin.dto;

import com.mall.mbg.model.OmsCompanyAddress;
import com.mall.mbg.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
