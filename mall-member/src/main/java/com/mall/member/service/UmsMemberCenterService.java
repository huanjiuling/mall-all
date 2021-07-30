package com.mall.member.service;

import com.mall.member.domain.PortalMemberInfo;

public interface UmsMemberCenterService {

    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    PortalMemberInfo getMemberInfo(Long memberId);
}
