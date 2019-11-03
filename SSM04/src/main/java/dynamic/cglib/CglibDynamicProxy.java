package dynamic.cglib;

import aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {

    public Object createProxy(Object target) {
        //创建一个动态类（增强类）对象
        Enhancer enhancer = new Enhancer();
        //确定需要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());
        //确定代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor的方法
        enhancer.setCallback(this);
        //返回创建的代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //创建一个切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check();
        myAspect.except();
        Object obj = methodProxy.invokeSuper(o, objects);
        //后增强
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
}
