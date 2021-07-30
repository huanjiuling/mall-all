package com.mall.admin.dao;

import com.mall.mbg.model.UmsAdminRoleRelation;
import com.mall.mbg.model.UmsPermission;
import com.mall.mbg.model.UmsRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
