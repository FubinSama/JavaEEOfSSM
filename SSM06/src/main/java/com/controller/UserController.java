package com.controller;

import com.dao.UserDao;
import com.po.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("userController")
public class UserController {
    @Autowired
    private UserDao userDao;

    public void test(){
        //查询一个用户
        MyUser auser = userDao.selectUserById(1);
        System.out.println(auser);
        System.out.println("====================");
        //添加一个用户
        MyUser addUser = new MyUser();
        addUser.setUname("wfb");
        addUser.setUsex("男");
        int addCnt = userDao.addUser(addUser);
        System.out.println("添加了" + addCnt + "条记录");
        System.out.println("====================");
        //修改一个用户
        MyUser updateUser = new MyUser();
        updateUser.setUid(1);
        updateUser.setUname("wfb");
        updateUser.setUsex("男");
        int updateCnt = userDao.updateUser(updateUser);
        System.out.println("修改了" + updateCnt + "条记录");
        System.out.println("====================");
        //删除一个用户
        int deleteCnt = userDao.deleteUser(1);
        System.out.println("删除了" + deleteCnt + "条记录");
        System.out.println("====================");
        //查询所有用户
        List<MyUser> list = userDao.selectAllUser();
        for(MyUser myUser : list) {
            System.out.println(myUser);
        }
    }
}
