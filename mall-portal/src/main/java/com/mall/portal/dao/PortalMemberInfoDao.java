package com.mall.portal.dao;

import com.mall.portal.domain.PortalMemberInfo;

public interface PortalMemberInfoDao {
    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    PortalMemberInfo getMemberInfo(Long memberId);
}
