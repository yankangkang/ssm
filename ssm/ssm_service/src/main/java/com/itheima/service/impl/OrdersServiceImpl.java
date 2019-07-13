package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.dao.IOrdersDao;
import com.itheima.domain.Orders;
import com.itheima.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;
    @Override
    public List<Orders> findAll(Integer page, Integer pagesize) throws Exception {
        //page代表当前页码数,pagesize代表每页显示条数
        PageHelper.startPage(page,pagesize);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String id) throws Exception {


        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");
        System.out.println("dev5");

        return ordersDao.findById(id);
    }
}
