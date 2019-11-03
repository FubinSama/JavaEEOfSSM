package test;

import annotation.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
@Repository 用于将DAO的类标识为Bean，功能与@Component相同
@Service    用于将Service的类标识为Bean，功能与@Component相同
@Controller 用于将Controller的类标识为Bean，功能与@Component相同
@Autowired  默认按照Bean的类型进行装配
@Resoure    默认按照名称进行装配，无匹配名称时进行按类型装配
@Qualifier  与Autowired注解配合使用，用来实现按Bean的名称进行装配
 */
public class TestMoreAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestController controller = (TestController) context.getBean("testController");
        controller.save();
    }
}
