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
    * MyBatis整合Spring
    * MyBatis自动生成
7. 映射器:
    * SQL映射文件常用配置元素：
        * select    查询语句
        * insert    插入语句
        * update    更新语句
        * delete    删除语句
        * sql       定义一部分SQL，在多个位置被引用
        ```xml
        <mapper>
          <sql id="comColumns">id, uname, usex</sql>
          <select id="selectUser" resultType="com.po.MyUser">
              select <include refid="comColumns" /> from user
          </select>
        </mapper>
        ```
        * resultMap 用来描述从数据库结果集中来加载对象
        ```xml
          <resultMap type="" id="">
              <constructor> <!--类在实例化时用来注入结果到构造方法-->
                  <idArg /> <!--ID参数，结果为ID-->
                  <arg /> <!--注入到构造方法的一个普通结果-->
              </constructor>
              <id property="" column="" /> <!--用来表示哪个列是主键-->
              <result property="" column="" /> <!--注入到字段或JavaBean属性的普通结果-->
              <association property="" /> <!--用于一对一关联-->
              <collection property="" />  <!--用于一对多、多对多关联-->
              <discriminator javaType=""> <!--使用结果值来决定使用哪个结果映射-->
                  <case value="" />   <!--基于某些值的结果映射-->
              </discriminator>
          </resultMap>
        ```
    * 主键：
        * 主键回填（主键自动递增）：
        ```xml
        <insert id="addUser" parameterType="com.po.MyUser" keyProperty="uid" useGeneratedKeys="true">
          insert into user(uname, usex) values(#{uname}, #{usex})
        </insert>
        ```
        * 自定义主键：
        ```xml
        <insert id="insertUser" paramterType="com.po.MyUser">
          <!--先使用selectKey元素定义主键，然后再定义SQL语句-->
          <selectKey keyProperty="uid" resultType="Integer" order="BEFORE">
              select if(max(uid) is null, 1, max(uid)+1) as newUid from user
          </selectKey>
          insert into user (uid, uname, usex) values (#{uid}, #{uname}, #{usex})
        </insert>
        ```
    * 级联查询        
        * 一对一(TestOneToOne)
        * 一对多(TestOneToMore)
        * 多对多(TestMoreToMore)
8. 动态SQL:
    * &lt;if&gt;元素
    * &lt;choose&gt;元素及其子元素&lt;when&gt;和&lt;otherwise&gt;
    * &lt;trim&gt;元素
    * &lt;where&gt;元素
    * &lt;set&gt;元素
    * &lt;foreach&gt;元素
    * &lt;bind&gt;元素
9. SpringMVC入门:
    * 工作原理：
        1. 客户端请求提交DispatcherServlet
        2. 由DispatcherServlet控制器寻找一个或多个HandlerMapping，找到处理请求的Controller
        3. DispatcherServlet将请求提交到Controller
        4. Controller调用业务逻辑处理后返回ModelAndView
        5. DispatcherServlet寻找一个或多个ViewResolver视图解析器，找到ModelAndView指定的视图
        6. 视图负责将结果显示到客户端
    * org.springframework.web.servlet.DispatcherServlet初始化时默认在WEB-INF目录下查找一个servletName-servlet.xml配置文件   
10. SpringMVC的Controller:
    * @RequestMapping：可以注解类和方法，表示请求路径
    * @PathVariable：可以获取URL中的参数
    * @RequestParam：请求参数被该注解注解后，若请求参数与接收参数不一致，则报404错误；不加该注解不会报错。
    * @ModelAttribute:
        * 注解接收请求参数，相当于model.addAttribute();
        * 注解方法，该方法会在每次调用该控制器的请求处理方法前被调用。
    * 重定向和转发都需要符合视图解析的配置，如果转发到一个不需要DispatcherServlet的资源，则需要进行<mvc:resources />的配置
11. 类型转换和格式化:
    * Converter<S,T>：类型转换器，将S类型转换成T类型。
    * Formatter<T>：格式化转换器，完成String类型和T类型的转换。
    * 实现步骤：
        1. 继承相应接口，实现接口声明的方法
        2. 配置ConversionServiceFactoryBean
        3. <mvc:annotation-driven conversion-service="设置为步骤b配置的bean" />
    * 配置示例：
    ```xml
        <beans>
            <!-- 注册MyFormatter和GoodsConverter -->
            <bean id="conversionService2" class="org.springframework.format.support.FormattingConversionServiceFactoryBean">
                <property name="formatters">
                    <list>
                        <bean class="formatter.MyFormatter" />
                    </list>
                </property>
                <property name="converters">
                    <list>
                        <bean class="converter.GoodsConverter" />
                    </list>
                </property>
            </bean>
        
            <mvc:annotation-driven conversion-service="conversionService2" />
            
        </beans>
    ```  
12. 数据绑定和表单标签库
13. 拦截器
14. 数据验证
15. 国际化
16. 统一异常处理
17. 文件的上传和下载
18. EL与JSTL
19. SSM框架整合