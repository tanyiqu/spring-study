# Spring

## Spring简介

### 简介

2002年，首次推出Spring的雏形：interface21

2004年3月24日正式发布1.0正式版

**Rod Johnson**，Spring Framework的创始人

[官网](https://spring.io/projects/spring-framework#overview)

[spring所有版本下载地址](https://repo.spring.io/release/org/springframework/spring/)

[GitHub](https://github.com/spring-projects/spring-framework)



### 优点

- Spring是一个开源的免费的框架
- Spring是一个轻量级、非入侵式的框架
- 控制反转（IOC）、面向切面编程（AOP）
- 支持事务的处理，对框架整合的支持

**总结：Spring是一个，轻量级的控制反转和面向切面编程的框架**



### Maven

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.9.RELEASE</version>
</dependency>



<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.1.RELEASE</version>
</dependency>
```



## Spring组成

- Spring Core
- Spring AOP
- Spring ORM
- Spring DAO
- Spring Web
- Spring Context
- Spring Web MVC



## 拓展

### Spring Boot

- 快速发开的脚手架
- 基于SpringBoot可以快速开发单个的微服务
- 约定 大于 配置



### Spring Cloud

- 基于SpringBoot实现的

