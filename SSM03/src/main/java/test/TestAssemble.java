package test;

import assemble.ComplexUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssemble {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //使用构造方法装配
        ComplexUser user1 = (ComplexUser) context.getBean("user1");
        System.out.println(user1);
        //使用setter装配
        ComplexUser user2 = (ComplexUser) context.getBean("user2");
        System.out.println(user2);
    }
}
