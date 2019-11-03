package test;

import instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
Bean的实例化：
1. 构造方法实例化
2. 静态工厂实例化
3. 实例工厂实例化
 */
public class TestInstance {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //测试构造方法实例化Bean
        BeanClass b1 = (BeanClass) context.getBean("constructorInstance");
        System.out.println(b1 + ":" + b1.message);
        //测试静态工厂方法实例化Bean
        BeanClass b2 = (BeanClass) context.getBean("staticFactoryInstance");
        System.out.println(b2 + ":" + b2.message);
        //测试实例工厂方法实例化Bean
        BeanClass b3 = (BeanClass) context.getBean("instanceFactoryInstance");
        System.out.println(b3 + ":" + b3.message);
    }
}
