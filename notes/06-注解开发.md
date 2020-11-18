# 注解开发

## 1 环境准备

### 1.1 导入含有aop的依赖

使用 **02-HelloSpring** 的依赖就可以

### 1.2 配置文件导入约束

applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">
    
</beans>
```

### 1.3 开启注解支持

```xml
<!-- 开启注解支持 -->
<context:annotation-config/>
```

### 1.4 指定要扫码注解的包

```xml
<!-- 指定扫描的包 -->
<context:component-scan base-package="com.tanyiqu.pojo"/>
```

## 2 注解

### @Component

放在类上，等于注册了一个bean



### @Value

放在**属性**上，给属性赋值

```java
@Value("张四")
String name;
```

或放在**Set方法**上，给属性赋值

```java
@Value("张四")
public void setName(String name) {
    this.name = name;
}
```



### @Repository

同 **@Component**，在web开发中的dao中一般用这个，代表一个dao



### @Service

同 **@Component**，在web开发中的service中一般用这个，代表一个service



### @Controller

同 **@Component**，在web开发中的controller中一般用这个，代表一个controller



### @Scope

用在类上，指定作用域

```java
@Scope(value="singleton")
```

