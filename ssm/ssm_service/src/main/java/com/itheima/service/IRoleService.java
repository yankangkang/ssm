package com.itheima.service;

import com.itheima.domain.Permission;
import com.itheima.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;


    List<Permission> findAllOtherPermission(String roleId) throws Exception;

    Role findById(String roleId) throws Exception;

    void addRoleToPermission(String roleId, String[] permissionIds) throws Exception;
}
