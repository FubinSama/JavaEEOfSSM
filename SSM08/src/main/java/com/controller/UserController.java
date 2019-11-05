package com.controller;

import com.dao.UserDao;
import com.po.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    public void test(){
        MyUser ifmu = new MyUser();
        ifmu.setUname("w");
        ifmu.setUsex("男");
        List<MyUser> listByIf = userDao.selectUserByIf(ifmu);
        System.out.println("if元素===================");
        for (MyUser myUser : listByIf) {
            System.out.println(myUser);
        }

        MyUser choosemu = new MyUser();
        choosemu.setUname("w");
        choosemu.setUsex("");
        List<MyUser> listByChoose = userDao.selectUserByChoose(choosemu);
        System.out.println("choose元素===================");
        for (MyUser myUser : listByChoose) {
            System.out.println(myUser);
        }

        MyUser trimmu = new MyUser();
        trimmu.setUname("w");
        trimmu.setUsex("男");
        List<MyUser> listByTrim = userDao.selectUserByTrim(trimmu);
        System.out.println("trim元素===================");
        for (MyUser myUser : listByTrim){
            System.out.println(myUser);
        }

        MyUser wheremu = new MyUser();
        wheremu.setUname("w");
        wheremu.setUsex("男");
        List<MyUser> listByWhere = userDao.selectUserByWhere(wheremu);
        System.out.println("where元素===================");
        for (MyUser myUser : listByWhere){
            System.out.println(myUser);
        }

        MyUser setmu = new MyUser();
        setmu.setUid(1);
        setmu.setUname("w");
        int setup = userDao.updateUserBySet(setmu);
        System.out.println("set元素修改了" + setup + "条记录");
        System.out.println("=====================");

        List<Integer> listId = Arrays.asList(new Integer[]{1, 2});
        List<MyUser> listByForeach = userDao.selectUserByForeach(listId);
        System.out.println("foreach元素===================");
        for (MyUser myUser : listByForeach) {
            System.out.println(myUser);
        }

        MyUser bindmu = new MyUser();
        bindmu.setUname("w");
        List<MyUser> listByBind = userDao.selectUserByBind(bindmu);
        System.out.println("bind元素===================");
        for (MyUser myUser : listByBind){
            System.out.println(myUser);
        }
    }
}
