# Hello Spring

## 1 新建maven项目

导入依赖

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.1.RELEASE</version>
</dependency>
```

## 2 实体类

Hello.java

```java
public class Hello {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
```

## 3 配置文件

applicationContext.xml 或 beans.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 使用spring创建对象 -->
    <bean id="hello" class="com.tanyiqu.pojo.Hello">
        <property name="name" value="Spring"/>
    </bean>

</beans>
```

## 4 测试

MyTest.java

```java
@Test
public void test() {
    // 获取spring的上下文对象
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Hello hello = (Hello) context.getBean("hello");
    System.out.println(hello);
}
```

