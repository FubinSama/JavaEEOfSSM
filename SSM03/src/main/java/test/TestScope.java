package test;

import instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
Bean的作用域(默认为1，通过scope属性指定)：
1. singleton    在Spring容器中只有一个Bean实例
2. prototype    每次获取，容器都会创建一个新的Bean实例
3. request      在一次HTTP请求中将返回一个Bean实例，不同请求返回不同的Bean实例。仅在Web Spring应用程序上下文中使用
4. session      在一个HTTP session中返回同一个实例，仅在Web Spring应用程序上下文中使用
5. application  为每一个ServletContext对象创建一个实例，即同一个应用共享一个Bean实例，仅在Web Spring应用程序上下文中使用
6. websocket    为每个WebSocket对象创建一个Bean实例。仅在Web Spring应用程序上下文中使用
 */
public class TestScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanClass b1 = (BeanClass) context.getBean("constructorInstance");
        BeanClass b2 = (BeanClass) context.getBean("constructorInstance");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}
