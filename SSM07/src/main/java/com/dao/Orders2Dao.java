package com.dao;

import com.po.Orders2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orders2Dao")
@Mapper
public interface Orders2Dao {
    List<Orders2> selectOrdersById(Integer id);
    List<Orders2> selectAllOrdersAndProducts();
}
