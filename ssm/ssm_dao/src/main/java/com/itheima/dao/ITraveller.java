package com.itheima.dao;

import com.itheima.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITraveller {

    @Select("select * from traveller where id in (select travellerid from order_traveller where orderId =#{id})")
    List<Traveller> findByOrdersId(String id) throws Exception;

}
