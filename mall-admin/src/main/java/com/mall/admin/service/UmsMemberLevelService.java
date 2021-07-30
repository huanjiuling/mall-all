package com.mall.admin.service;

import com.mall.mbg.model.UmsMemberLevel;
import java.util.List;

public interface UmsMemberLevelService {
    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
