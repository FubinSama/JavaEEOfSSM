package aspectj.annotation;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAspectJTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDaoAdvice = (TestDao) context.getBean("testDao2");
        testDaoAdvice.save();
    }
}
