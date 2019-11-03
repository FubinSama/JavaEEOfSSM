# JavaEEOfSSM
wfb create it to learn SSM and Git
1. Spring入门
2. SpringIoc(DI:构造器注入和Setter方法注入)
3. Spring Bean
    * Bean的实例化（TestInstance） 
    * Bean的作用域（TestScope）
    * Bean的生命周期（TestLife）
    * Bean的装配方式（通过XML：TestAssemble和通过注解：TestAnnotation、TestMoreAnnotation）
4. Spring AOP 
    * 常用术语：
        * 切面(Aspect)：封装横切到系统功能（例如事务处理）的类
        * 连接点(Joinpoint)：程序运行中的一些时间点，例如：方法的调用或异常的抛出
        * 切入点(Pointcut)：需要处理的连接点。在Spring AOP中，所有方法的执行都是连接点，而切入点是一个描述信息，它修饰的是连接点，
        通过切入点确定哪些连接点需要被处理。
        * 通知(Advice)：由切面添加到特定的连接点（满足切入点规则）的一段代码，即在定义好的切入点处所要执行的程序代码，
        可以将其理解为切面开启后切面的方法，因此通知是切面的具体实现。
        * 引入(Introduction)：允许在现有的实现类中添加自定义的方法和属性。
        * 目标对象(Target Object)：所有被通知的对象。如果AOP框架使用运行时代理的方法（动态的AOP）来实现切面，
        那么通知对象总是一个代理对象。
        * 代理(Proxy)：通知应用到目标对象之后被动态创建的对象。
        * 织入(Weaving)：将切面代码插入到目标对象上，从而生成代理对象的过程。根据不同的实现技术，AOP有3种织入方式：
        编译期织入，需要有特殊的Java编译器；类装载期织入，需要有特殊的类加载器；动态代理织入，
        在运行期为目标类添加通知生成子类的方式。Spring AOP框架默认采用动态代理织入，
        而AspectJ（基于Java语言的AOP框架）采用编译期织入和类装载期织入。
    * 通知类型：
        * 环绕通知(MethodInterceptor)：在目标方法执行前和执行后实施增强，可应用于日志记录、事务处理等功能。
        * 前置通知(MethodBeforeAdvice)：在目标方法执行前实施增强，可应用于权限管理等功能。
        * 后置返回通知(AfterReturningAdvice)：在目标方法成功执行后实施增强，可应用于关闭流、删除临时文件等功能。
        * 后置（最终）通知(AfterAdvice)：在目标方法执行后实施增强，与后置返回通知不同的是，不管是否发生异常都要执行该类通知，
        该类通知可应用于释放资源。
        * 异常通知(ThrowsAdvice)：在方法抛出异常后实施增强，可应用于处理异常、记录日志等功能。
        * 引入通知(IntroductionInterceptor)：在目标类中添加一些新的方法和属性，可应用于修改目标类（增强类）。
5. Spring的事务管理:
    * Spring的数据库编程（TestSpringJDBC）
    * 编程式事务管理（TestCodeTransaction）
    * 声明式事务管理（XMLTest、AnnotationTest）
6. MyBatis开发入门
7. 映射器
8. 动态SQL
9. SpringMVC入门
10. SpringMVC的Controller
11. 类型转换和格式化
12. 数据绑定和表单标签库
13. 拦截器
14. 数据验证
15. 国际化
16. 统一异常处理
17. 文件的上传和下载
18. EL与JSTL
19. SSM框架整合