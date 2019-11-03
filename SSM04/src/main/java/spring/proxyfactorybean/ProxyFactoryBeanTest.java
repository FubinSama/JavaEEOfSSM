package spring.proxyfactorybean;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
基于代理类的AOP实现：使用org.springframework.aop.framework.ProxyFactoryBean类实例为其他Bean实例创建代理实例。
该类常用属性：
target：代理的目标对象
proxyInterfaces：代理需要实现的接口列表，如果是多个接口，使用<list><value></value>...<value></value></list>方式赋值
interceptorNames：需要织入目标的Advice
proxyTargetClass：是否对类代理而不是接口，默认为false，使用JDK动态代理；当为true时，使用CGLIB动态代理
singleton：返回的代理实例是否为单例，默认为true
optimize：当设置为true时强制使用CGLIB动态代理
 */
public class ProxyFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDaoAdvice = (TestDao) context.getBean("testDaoProxy");
        testDaoAdvice.save();
        System.out.println("====================");
        testDaoAdvice.modify();
        System.out.println("====================");
        testDaoAdvice.delete();
    }
}
