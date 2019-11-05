package com.dao;

import com.po.MyUser;
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
    List<MyUser> selectUserByIf(MyUser user);
    List<MyUser> selectUserByChoose(MyUser user);
    List<MyUser> selectUserByTrim(MyUser user);
    List<MyUser> selectUserByWhere(MyUser user);
    int updateUserBySet(MyUser user);
    List<MyUser> selectUserByForeach(List<Integer> listId);
    List<MyUser> selectUserByBind(MyUser user);
}
