

## 7、Bean的自动装配

使用autowire语句来实现自动装配

### 7.1、ByName自动装配

```xml
		<bean id="cat" class="com.tyfann.pojo.Cat"/>
    <bean id="dog" class="com.tyfann.pojo.Dog"/>

    <bean id="person" class="com.tyfann.pojo.Person" autowire="byName">
        <property name="name" value="芋饭糖"/>
    </bean>
```



### 7.2、ByType自动装配

```xml
    <bean class="com.tyfann.pojo.Cat"/>
    <bean class="com.tyfann.pojo.Dog"/>

    <bean id="person" class="com.tyfann.pojo.Person" autowire="byType">
        <property name="name" value="芋饭糖"/>
    </bean>
```

### 7.3、使用注解实现自动装配

java1.5支持的注解，spring2.5就支持注解了

要使用注解须知：

1. 导入约束。context约束
2. 配置注解的支持

#### @Autowired注解

```java
		@Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
```

#### @Resource注解

```java
    @Resource
    private Cat cat;
    @Resource
    private Dog dog;
```

**@Resource和@Autowired的区别：**

- 都是用来自动装配的，都可以放在属性字段上
- @Autowired通过byType的方式实现，而且必须要求这个对象存在！
- @Resource默认通过byName方式实现，如果找不到名字，则通过byType实现。如果两个都找不到的情况下，就报错！
- 执行顺序不同：@Autowired通过byType的方式实现，@Resource默认通过byName的方式实现。

**注解支持的配置方法：**
```xml
<context:annotation-config/>
```

## 8、使用注解进行开发
使用@Component需要在xml文件中开启component扫描
```xml
<context:component-scan base-package="com.tyfann"/>
```

@Component的衍生注解：
- dao【@Repository】
- service【@Service】
- controller【@Controller】

这四个注解功能都是一样的，都是代表将某个类注册到spring容器中装配

## 9、使用Java的方式配置Spring
我们现在要完全不使用spring的xml配置，而全权交给Java来做！

JavaConfig是Spring的一个子项目，在Spring4之后，它成为了一个核心功能。

## 10、代理模式

### 10.1、静态代理

角色分析：
- 抽象角色：一般会使用接口或者抽象类来解决
- 真实角色：被代理的角色
- 代理角色：代理真实角色，代理真实角色后，我们一般会做一些附属操作
- 客户：访问代理对象的人

**代理模式的好处：**

- 可以使真实角色的操作更加纯粹！不用去关注一些公共的业务
- 公共业务交给代理角色！实现了业务的分工
- 公共业务发生扩展的时候，方便集中管理

**缺点**

- 一个真实角色就会产生一个代理角色，代码量会翻倍～开发效率降低

### 10.2、动态代理

- 动态代理和静态代理角色一样
- 动态代理的代理类是动态生成的，不是我们直接写好的！
- 动态代理分为两大类：基于接口的动态代理，基于类的动态代理
- - 基于接口---JDK动态代理
    
- - 基于类：CGlib
    
- - java字节码实现：Javassist
    
## AOP

- 横切关注点：跨越应用程序多个模块的方法或功能。即是与我们业务逻辑无关的，但是我们需要关注的部分，就是横切关注点。如日志，安全，缓存，事务等等...
- 切面（ASPECT）：横切关注点被模块化的特殊对象。即，它是一个类。
- 通知（Advice）：切面必须要完成的工作。即它是类中的一个方法。
- 目标（Target）：被通知对象
- 代理（Proxy）：向目标对象应用通知之后创建的对象。
- 切入点（PointCut）：切面通知执行的"地点"的定义。
- 连接点（JointPoint）：与切入点匹配的执行点。