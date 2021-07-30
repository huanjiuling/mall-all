package com.mall.admin.dao;

import com.mall.mbg.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
