# 自动装配

## ByName

id必须全局唯一

配置文件：

```xml
<bean id="cat" class="com.tanyiqu.pojo.Cat"/>

<bean id="dog" class="com.tanyiqu.pojo.Dog"/>

<bean id="person" class="com.tanyiqu.pojo.Person" autowire="byName">
    <property name="name" value="张三"/>
</bean>
```



## ByType

必须只有一个类型相同的被装配的bean，这个bean可以不加id

配置文件：

```xml
<bean class="com.tanyiqu.pojo.Cat"/>

<bean class="com.tanyiqu.pojo.Dog"/>

<bean id="person" class="com.tanyiqu.pojo.Person" autowire="byType">
    <property name="name" value="张三"/>
</bean>
```



## 注解 @Autowired

beans.xml 配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">

    <!-- 开启注解支持 -->
    <context:annotation-config/>

    <bean id="cat" class="com.tanyiqu.pojo.Cat"/>
    <bean id="dog" class="com.tanyiqu.pojo.Dog"/>
    <bean id="person" class="com.tanyiqu.pojo.Person">
        <property name="name" value="张三"/>
    </bean>

</beans>
```

之后在Person的Dog和Cat属性前加上**@Autowired**注解

```java
public class Person {
    String name;
    
    @Autowired
    @Qualifier(value = "cat")
    Cat cat;

    @Resource(name = "dog")
    Dog dog;
    
    // 使用@Autowired可以省略Set方法    
}
```



## 其他

@Resources注解也可以实现自动装配