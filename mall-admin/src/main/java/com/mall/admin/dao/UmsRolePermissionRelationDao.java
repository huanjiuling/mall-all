package com.mall.admin.dao;

import com.mall.mbg.model.UmsPermission;
import com.mall.mbg.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UmsRolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list")List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
