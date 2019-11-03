package com.ch5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
//Spring JDBC
public class TestSpringJDBC {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao td = (TestDao) context.getBean("testDao");
        String insertSql = "insert into user values(null, ?, ?)";
        Object param1[] = {"wfb1", "男"};
        Object param2[] = {"wfb2", "男"};
        Object param3[] = {"wfb3", "男"};
        Object param4[] = {"wfb4", "男"};
        td.update(insertSql, param1);
        td.update(insertSql, param2);
        td.update(insertSql, param3);
        td.update(insertSql, param4);
        String selectSql = "select * from user";
        List<MyUser> list = td.query(selectSql, null);
        for (MyUser user : list){
            System.out.println(user);
        }
    }
}
