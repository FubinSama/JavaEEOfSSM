package aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect //对应于<aop:aspect ref="myAspect" />
@Component  //对应于<bean id="myAspect" class="aspectj.xml.MyAspect" />
public class MyAspect {
    //定义切入点
    @Pointcut("execution(* dynamic.jdk.*.*(..))")
    private void myPointCut() {
        //对应于<aop:pointcut expression="execution(* dynamic.jdk.*.*(..))" id="myPointCut" />
        //注意：该方法必须为无参无返回值的空方法
    }

    @Before("myPointCut()") //对应于<aop:before method="before" pointcut-ref="myPointCut" />
    public void before(JoinPoint jp) {
        System.out.print("前置通知：模拟权限控制");
        System.out.println("，目标类对象：" + jp.getTarget() + "，被增强处理的方法：" + jp.getSignature().getName());
    }

    @AfterReturning("myPointCut()")
    public void afterReturning(JoinPoint jp) {
        System.out.print("后置返回通知：模拟删除临时文件");
        System.out.println("，被增强处理的方法：" + jp.getSignature().getName());
    }

    @Around("myPointCut()")
    //环绕通知返回类型必须是Object，第一个参数必须是ProceedingJoinPoint类型，必须throws Throwable
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕开始：执行目标方法前，模拟开启事务");
        Object obj = pjp.proceed();
        System.out.println("环绕结束：执行目标方法后，模拟关闭事务");
        return obj;
    }

    @AfterThrowing(value = "myPointCut()", throwing = "e")
    public void except(Throwable e) {
        System.out.println("异常通知：程序执行异常" + e.getMessage());
    }

    @After("myPointCut()")
    public void after() {
        System.out.println("最终通知：模拟释放资源");
    }
}
