package com.ch5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
基于底层API的编程式事务管理：
该例子主键重复，一定会执行回滚。
 */
public class TestCodeTransaction {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CodeTransaction ct = (CodeTransaction) context.getBean("codeTransaction");
        String result = ct.test();
        System.out.println(result);
    }
}
