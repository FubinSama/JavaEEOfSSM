package service;

import dao.TestDIDao;

public class TestDIServiceImpl implements TestDIService {
    private TestDIDao testDIDao;

    //构造方法，用于实现依赖注入接口对象testDIDao
    public TestDIServiceImpl(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }

    public void sayHello() {
        testDIDao.sayHello();
        System.out.println("TestDIService构造方法注入say: Hello, Study hard!");
    }
}
