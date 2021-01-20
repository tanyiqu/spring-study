## 步骤

- 创建项目、导入依赖
- 编写service类
- 编写切面类
- 配置注解支持
- 测试

<br>

## 创建项目

创建Maven的项目，添加依赖

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.9.RELEASE</version>
</dependency>

<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.5</version>
</dependency>

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.1</version>
</dependency>
```

<br>

## 编写service类

**userService.java**

```java
package love.tanyiqu.service;

@SuppressWarnings("unused")
public interface UserService {

    public void select();

    public void insert();
}
```

<br>

**userServiceImpl.java**

```java
package love.tanyiqu.service;

public class UserServiceImpl implements UserService {
    @Override
    public void select() {
        System.out.println("查询用户");
    }

    @Override
    public void insert() {
        System.out.println("添加用户");
    }
}
```

<br>

## 编写切面类

**MyPointcut.java**

```java
package love.tanyiqu.pointcut;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointcut {

    @Before("execution(* love.tanyiqu.service.*.*(..))")
    public void before() {
        System.out.println("===方法执行前===");
    }

    @After("execution(* love.tanyiqu.service.*.*(..))")
    public void after() {
        System.out.println("===方法执行后===");
    }
}
```

<br>

## 配置切入

**applicationContext.xml**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/aop
       https://www.springframework.org/schema/aop/spring-aop.xsd">

    <!-- userService -->
    <bean id="userService" class="love.tanyiqu.service.UserServiceImpl"/>

    <!-- 自定义的切入类 -->
    <bean id="annotationPointcut" class="love.tanyiqu.pointcut.AnnotationPointcut"/>

    <!-- 配置aop -->
    <aop:aspectj-autoproxy/>

</beans>
```

<br>

## 测试

**MyTest.java**

```java
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.select();
    }
}
```

<br>