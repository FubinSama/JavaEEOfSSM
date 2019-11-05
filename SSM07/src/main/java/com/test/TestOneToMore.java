package com.test;

import com.controller.OneToMoreController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOneToMore {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        OneToMoreController controller = (OneToMoreController) context.getBean("oneToMoreController");
        controller.test();
    }
}
