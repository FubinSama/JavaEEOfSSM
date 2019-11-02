package test;

import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //获取应用上下文
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao td = (TestDao) applicationContext.getBean("test"); //test为配置文件中的id
        td.sayHello();
    }
}
