package aspectj.xml;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
基于注解开发AspectJ
各类型通知与目标方法的执行过程(https://ask.qcloudimg.com/http-save/yehe-5738961/btuq0ankxq.jpeg?imageView2/2/w/1620)
 */
public class XMLAspectJTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDaoAdvice = (TestDao) context.getBean("testDao");
        testDaoAdvice.save();
    }
}
