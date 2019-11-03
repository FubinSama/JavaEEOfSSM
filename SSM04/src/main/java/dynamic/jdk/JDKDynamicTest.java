package dynamic.jdk;
/*
JDK动态代理：
    动态代理织入
    必须借助接口产生代理对象
 */
public class JDKDynamicTest {
    public static void main(String[] args) {
        //创建代理对象
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        //创建目标对象
        TestDao testDao = new TestDaoImpl();
        //从代理对象中获取增强后的目标对象，该对象是一个被代理的对象，它会进入代理的逻辑方法invoke中
        TestDao testDaoAdvice = (TestDao)jdkDynamicProxy.createProxy(testDao);
        //执行方法
        testDaoAdvice.save();
        System.out.println("====================");
        testDaoAdvice.modify();
        System.out.println("====================");
        testDaoAdvice.delete();
    }
}
