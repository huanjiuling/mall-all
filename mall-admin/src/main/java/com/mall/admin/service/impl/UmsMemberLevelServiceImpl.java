package com.mall.admin.service.impl;

import com.mall.admin.service.UmsMemberLevelService;
import com.mall.mbg.mapper.UmsMemberLevelMapper;
import com.mall.mbg.model.UmsMemberLevel;
import com.mall.mbg.model.UmsMemberLevelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
