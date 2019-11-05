package com.controller;

import com.dao.Orders2Dao;
import com.po.Orders2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MoreToMoreController {
    @Autowired
    private Orders2Dao orders2Dao;

    public void test(){
        List<Orders2> os = orders2Dao.selectAllOrdersAndProducts();
        for (Orders2 orders2 : os) {
            System.out.println(orders2);
        }
    }
}
