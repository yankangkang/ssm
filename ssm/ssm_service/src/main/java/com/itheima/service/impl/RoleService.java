package com.itheima.service.impl;

import com.itheima.dao.IRoleDao;
import com.itheima.domain.Permission;
import com.itheima.domain.Role;
import com.itheima.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleService implements IRoleService{
    @Autowired
    private IRoleDao roleDao;
    @Override
    public List<Role> findAll() throws Exception{
        return roleDao.findAll();
    }

    @Override
    public void save(Role role) throws Exception {
        roleDao.save(role);
    }

    @Override
    public List<Permission> findAllOtherPermission(String roleId) throws Exception {
        return roleDao.findAllOtherPermission(roleId);
    }

    @Override
    public Role findById(String roleId) throws Exception{
        return roleDao.findById(roleId);
    }

    @Override
    public void addRoleToPermission(String roleId, String[] permissionIds) throws Exception {
        for (String permissionId : permissionIds) {
            roleDao.addRoleToPermission(roleId,permissionId);
        }
    }


}
