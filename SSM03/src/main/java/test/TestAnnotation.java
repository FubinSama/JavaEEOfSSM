package test;

import annotation.AnnotationUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
基于注解装配Bean
 */
public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationUser user = (AnnotationUser) context.getBean("annotationUser");
        System.out.println(user.getUname());
    }
}
