package com.itheima.dao;

import com.itheima.domain.Permission;
import com.itheima.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IRoleDao {


    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="roleName",property="roleName"),
            @Result(column="roleDesc",property="roleDesc"),
            @Result(column="id",property="permissions",javaType=List.class,many=@Many(select="com.itheima.dao.IPermissionDao.findByRoleId"))})
            public List<Role> findRoleByUserId(String userId) throws Exception;




    @Select("select * from role")
    List<Role> findAll() throws Exception;



    @Insert("insert into role(roleName,roleDesc) values(#{roleName},#{roleDesc})")
    void save(Role role) throws Exception;




    @Select("select * from permission where id not in (select permissionid from role_permission where roleid = #{roleId})")
    List<Permission> findAllOtherPermission(String roleId);


    @Select("select * from role where id = #{roleId}")
    Role findById(String roleId) throws Exception;



    @Insert("insert into role_permission values (#{permissionId},#{roleId})")
    void addRoleToPermission(@Param("roleId") String roleId, @Param("permissionId") String permissionId) throws Exception;
}
