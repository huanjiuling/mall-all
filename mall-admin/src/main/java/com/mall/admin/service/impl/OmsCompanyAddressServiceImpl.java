package com.mall.admin.service.impl;

import com.mall.admin.service.OmsCompanyAddressService;
import com.mall.mbg.mapper.OmsCompanyAddressMapper;
import com.mall.mbg.model.OmsCompanyAddress;
import com.mall.mbg.model.OmsCompanyAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
