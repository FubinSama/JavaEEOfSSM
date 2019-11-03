package test;

import life.BeanLife;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
Bean的生命周期：
1. 根据Bean的配置情况实例化Bean
2. 根据Spring上下文对实例化的Bean进行依赖注入（DI）
3. 如果Bean实现了BeanNameAware接口，则调用setBeanName(String beanId)方法，beanId是Spring配置文件中bean的id
4. 如果Bean实现了BeanFactoryAware接口，则调用setBeanFactory方法
5. 如果Bean实现了ApplicationContextAware接口，则setApplicationContext(ApplicationContext context)方法
6. 如果Bean实现了BeanPostProcessor接口，则调用初始化方法postProcessBeforeInitialization(Object obj, String s)对Bean进行操作
7. 如果Bean实现了InitializingBean接口，则调用afterPropertiesSet方法
8. 如果Bean在Spring配置文件中配置了init-method属性，则自动调用其配置的初始化方法
9. 如果Bean实现了BeanPostProcessor接口，则调用初始化方法postProcessAfterInitialization(Object obj, String s)对Bean进行操作
10.     使用Bean。
11.如果Bean实现了DisposableBean接口，则调用destroy方法
12.如果在配置文件中配置了destroy-method属性，则调用其配置的销毁方法。

执行结果：
    life.BeanLife执行自定义的初始化方法
    获取对象前
    获取对象后
    life.BeanLife执行自定义的销毁方法
 */
public class TestLife{
    public static void main(String[] args) {
        //为了方便演示销毁方法的执行，ClassPathXmlApplicationContext实例的close方法。
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("获取对象前");
        BeanLife beanLife = (BeanLife) ctx.getBean("beanLife");
        System.out.println("获取对象后");
        ctx.close();
    }
}
