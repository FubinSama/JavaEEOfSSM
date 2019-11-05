package com.dao;

import com.po.MyUser;
import com.pojo.SelectUserOrdersById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
@Mapper
public interface UserDao {
    MyUser selectUserById(Integer uid);
    List<MyUser> selectAllUser();
    int addUser(MyUser user);
    int updateUser(MyUser user);
    int deleteUser(Integer uid);
    MyUser selectUserOrdersById1(Integer uid);
    MyUser selectUserOrdersById2(Integer uid);
    List<SelectUserOrdersById> selectUserOrdersById3(Integer uid);
}
