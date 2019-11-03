package com.statement.test;

import com.statement.controller.StatementController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
基于@Transsactional注解的声明式事务管理，其rollbackFor属性指定不对该异常进行回滚
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "com/statement/xml/annotationstatementapplicationContext.xml");
        StatementController sc = (StatementController) context.getBean("statementController");
        String result = sc.test();
        System.out.println(result);
    }
}
