package com.dao;

import com.po.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ordersDao")
@Mapper
public interface OrdersDao {
    List<Orders> selectOrdersById(Integer id);
}
