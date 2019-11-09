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
12. 数据绑定和表单标签库：记得对tomcat进行-Dfile.encoding=UTF-8的设置，否则中文会在后台乱码
13. 拦截器：
    * 拦截器的定义：通过实现HandlerInterceptor接口，该接口定义的方法：
        * preHandle：在控制器的请求方法前执行，其返回值表示是否中断后续操作，返回true表示继续向下执行，返回false表示中断后续操作。
        * postHandle：在控制器的处理请求方法调用之后、解析视图之前执行，可以通过此方法对请求域中的模型和视图做进一步的修改。
        * afterCompletion：在控制器的处理请求方法执行完成后执行，即视图渲染结束后执行，
        可以通过此方法实现一些资源清理、记录日志信息等工作。
    * 配置示例：
    ```xml
        <!--配置拦截器，注意各个标签的顺序-->
        <mvc:interceptors>
            <!--配置一个全局拦截器，拦截所有请求-->
            <bean class="interceptor.TestInterceptor" />
            <mvc:interceptor>
                <!--配置拦截器作用的路径，对所有路径有效-->
                <mvc:mapping path="/**" />
                <!--配置不需要拦截作用的路径-->
                <mvc:exclude-mapping path="" />
                <!--定义在<mvc:interceptor>元素中，表示匹配指定路径的请求才进行拦截-->
                <bean class="interceptor.Interceptor1" />
            </mvc:interceptor>
            <!--第二个拦截器-->
            <mvc:interceptor>
                <!--配置拦截器作用的路径，只对以gotoTest结尾的路径有效-->
                <mvc:mapping path="/gotoTest" />
                <!--配置不需要拦截作用的路径-->
                <mvc:exclude-mapping path="" />
                <!--定义在<mvc:interceptor>元素中，表示匹配指定路径的请求才进行拦截-->
                <bean class="interceptor.Interceptor2" />
            </mvc:interceptor>
        </mvc:interceptors>
    ``` 
14. 数据验证:
    * 在SpringMVC框架中先进行数据类型转化，再进行服务器端验证。
    * 验证输入数据的两种方式：
        * 利用Spring自带的验证框架:
            1. 继承Validator接口，实现supports(要验证的model，返回false则不进行验证)和validate(对该model的验证处理)方法。
            2. 编写errorMessage.properties文件
            3. 配置消息属性文件
            ```xml
              <bean id="messageSource" class="org.springframework.context.support.ReloadableResourceBundleMessageSource">
                  <!-- 注意不要漏下classpath，虽然加上它IDEA会报错，但是不加会导致找不到该资源文件 -->
                  <property name="basename" value="classpath:errorMessages" />
              </bean>
            ```
        * 利用JSR303实现：
            1. 添加hibernate validate的相关jar包，详见pom.xml。
            2. 配置消息属性文件，注册校验器，并开启Spring的Valid功能:
            ```xml
              <beans>
                  <bean id="messageSource" class="org.springframework.context.support.ReloadableResourceBundleMessageSource">
                      <!-- 注意不要漏下classpath，虽然加上它IDEA会报错，但是不加会导致找不到该资源文件 -->
                      <property name="basename" value="classpath:errorMessages" />
                  </bean>
                  <!--注册校验器-->
                  <bean id="validator" class="org.springframework.validation.beanvalidation.LocalValidatorFactoryBean">
                      <!-- hibernate校验器 -->
                      <property name="providerClass" value="org.hibernate.validator.HibernateValidator" />
                      <!-- 指定校验使用的资源文件，在文件中配置校验错误信息，
                      如果不指定则默认使用classpath下的ValidationMessages.properties -->
                      <property name="validationMessageSource" ref="messageSource" />
                  </bean>
                  <!-- 开启Spring的Vaild功能 -->
                  <mvc:annotation-driven conversion-service="conversionService" validator="validator" />
              </beans>
            ```
            3. 为pojo添加相关的验证注解
            4. 为需要验证的模型添加@Valid注解
15. 国际化:
    * Java国际化：
        * 国际化的思想：将程序中的信息放在资源文件中，程序根据支持的国家及语言环境读取相应的资源文件。
        资源文件是key-value对，每个资源文件的key是不变的，但value随不同国家/语言变化。
        * Java程序的国际化主要通过两个类来完成：
            * java.util.Locale：用于提供本地信息，通常称它为语言环境，不同的语言、不同的国家和地区采用不同的Locale对象来表示。
            * java.util.ResourceBundle：该类称为资源包，包含了特定于语言环境的资源对象。当程序需要一个特定于语言环境的资源时
            （例如字符串资源），程序可以从适合当前用户语言环境的资源包中加载它。
        * 资源文件的命名的三种方式(language用两个小写字母表示，country用两个大写字母表示)：
            * baseName.properties   （最终匹配）
            * baseName_language.properties  （次优先匹配）
            * baseName_language_country.properties (最优先匹配)
    * SpringMVC的三个语言区域解析器：
        * AcceptHeaderLocaleResolver: 根据浏览器Http header中打的accpet-language域设定
        （appcept-language域中一般都包含了当前操作系统的语言设定，可通过HttpServletRequest.getLocale()方法获得），
        不支持改变Locale。
        * SessionLocaleResolver: 根据用户本次会话过程中的语言设定决定语言区域
        （例如用户进入首页时选择语言种类，则词汇话周期内统一使用该语言设定）
        * CookieLocaleResolver: 根据Cookie判定用户的语言设定（Cookie中保存着用户前一次的语言设定参数）。
    * 配置示例：
    ```xml
        <beans>
            <!--国际化操作拦截器，如果采用基于Session/Cookie则必须配置-->
           <mvc:interceptors>
               <bean class="org.springframework.web.servlet.i18n.LocaleChangeInterceptor">
                   <property name="paramName" value="locale" />
               </bean>
           </mvc:interceptors>
           <!--存储区域设置信息-->
           <bean id="localeResolver" class="org.springframework.web.servlet.i18n.SessionLocaleResolver">
               <property name="defaultLocale" value="zh_CH" />
           </bean>
        </beans>
    ```
    * SpringMVC中可以使用message标签在JSP页面中显示国际化消息：
        * 导入该标签：<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
        * message标签的常用属性：
            * code：获得国际化消息的key
            * arguments：代表该标签的参数。用来替换消息中的占位符。
            * argumentSeparator：用来分割该标签参数的字符，默认为逗号。
            * text：code属性不存在或指定的key无法获取消息时所显示的默认文本信息。
16. 统一异常处理
17. 文件的上传和下载
18. EL与JSTL
19. SSM框架整合