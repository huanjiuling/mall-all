package com.mall.admin.service;


import com.mall.mbg.model.OmsCompanyAddress;
import java.util.List;

public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
