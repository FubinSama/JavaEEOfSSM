package com.statement.test;

import com.statement.controller.StatementController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
基于XML方式的声明式事务管理
 */
public class XMLTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "com/statement/xml/XMLstatementapplicationContext.xml");
        StatementController sc = (StatementController) context.getBean("statementController");
        String result = sc.test();
        System.out.println(result);
    }
}
