package dao;

import exception.MyException;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository("testExceptionDao")
public class TestExceptionDao {
    public void daodb() throws Exception{
        throw new SQLException("Dao中数据库异常");
    }
    public void daomy() throws Exception{
        throw new MyException("Dao中自定义异常");
    }
    public void daono() throws Exception{
        throw new Exception("Dao中未知异常");
    }
}
