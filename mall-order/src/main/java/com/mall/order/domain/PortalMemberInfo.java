package com.mall.order.domain;

import com.mall.mbg.model.UmsMember;
import com.mall.mbg.model.UmsMemberLevel;
import lombok.Data;

@Data
public class PortalMemberInfo extends UmsMember {
    private UmsMemberLevel umsMemberLevel;
}
