package com.test;

import com.controller.OneToOneController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOneToOne {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        OneToOneController controller = (OneToOneController) context.getBean("oneToOneController");
        controller.test();
    }
}
