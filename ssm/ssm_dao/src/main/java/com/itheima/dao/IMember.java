package com.itheima.dao;

import com.itheima.domain.Member;
import org.apache.ibatis.annotations.Select;

public interface IMember {


    @Select("select * from member where id = #{id}")
    Member findById(String id) throws Exception;
}
