package dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import po.MyUser;

import java.util.List;

@Repository("userDao")
@Mapper
public interface UserDao {
    public List<MyUser> selectUserByUname(MyUser user);
}
