package controller;

import exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.TestExceptionService;

import java.sql.SQLException;

@Controller
public class Test2ExceptionController extends BaseController{
    @Autowired
    public TestExceptionService testExceptionService;

    @RequestMapping("/db2")
    public void db() throws Exception{
        throw new SQLException("控制器中数据库异常");
    }

    @RequestMapping("/my2")
    public void my() throws Exception{
        throw new MyException("控制器中自定义异常");
    }

    @RequestMapping("/no2")
    public void no() throws Exception{
        throw new Exception("控制器中未知异常");
    }

    @RequestMapping("/servicedb2")
    public void servicedb() throws Exception{
        testExceptionService.servicedb();
    }

    @RequestMapping("/servicemy2")
    public void servicemy() throws Exception{
        testExceptionService.servicemy();
    }

    @RequestMapping("/serviceno2")
    public void serviceno() throws Exception{
        testExceptionService.serviceno();
    }

    @RequestMapping("/daodb2")
    public void daodb() throws Exception{
        testExceptionService.daodb();
    }

    @RequestMapping("/daomy2")
    public void daomy() throws Exception{
        testExceptionService.daomy();
    }

    @RequestMapping("/daono2")
    public void daono() throws Exception{
        testExceptionService.daono();
    }
}
