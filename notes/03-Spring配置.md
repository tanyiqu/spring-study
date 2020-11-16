# Spring配置

## bean：Bean

```xml
<!-- bean -->
<bean id="user1" class="com.tanyiqu.pojo.User">
    <property name="name" value="张三"/>
    <property name="sex" value="男"/>
</bean>
```



## alias：别名

```xml
<!-- 别名 -->
<alias name="user1" alias="u1"/>
```



## import：导入

另一个xml配置文件 other.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean -->
    <bean id="user2" class="com.tanyiqu.pojo.User">
        <property name="name" value="张四"/>
        <property name="sex" value="男"/>
    </bean>

</beans>
```

导入这个文件

```xml
<!-- 导入 -->
<import resource="other.xml"/>
```

