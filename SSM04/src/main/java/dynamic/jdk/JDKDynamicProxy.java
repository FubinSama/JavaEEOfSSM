package dynamic.jdk;

import aspect.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {
    //声明目标类接口对象（真实对象）
    private TestDao testDao;

    //创建代理的方法，建立代理对象和真实对象的代理关系，并返回代理对象
    public Object createProxy(TestDao testDao) {
        this.testDao = testDao;
        ClassLoader cl = JDKDynamicProxy.class.getClassLoader();
        Class[] clazz = testDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(cl, clazz, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //创建一个切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check();
        myAspect.except();
        //在目标类上调用方法并传入参数
        Object obj = method.invoke(testDao, args);
        //后增强
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
}
