# 依赖注入

## 1 构造器注入

使用构造器注入



## 2 Set注入【重点】

**使用set方法注入**

### 2.1 实体类

Student.java

```java
public class Student {
    String name;
    Address address;
    String[] books;
    List<String> hobbies;
    Map<String, String> card;
    Set<String> games;
    String wife;
    Properties info;
    
    // setter方法
}
```



Address.java

```java
public class Address {
    String address;

    @Override
    public String toString() {
        // ...
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
```



### 2.2 beans.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="addr" class="com.tanyiqu.pojo.Address">
        <property name="address" value="平顶山"/>
    </bean>

    <bean id="student" class="com.tanyiqu.pojo.Student">
        <!-- 普通值注入 -->
        <property name="name" value="张三"/>

        <!-- ref注入 -->
        <property name="address" ref="addr"/>

        <!-- 数组 -->
        <property name="books">
            <array>
                <value>C++</value>
                <value>Java</value>
            </array>
        </property>

        <!-- List -->
        <property name="hobbies">
            <list>
                <value>唱</value>
                <value>跳</value>
                <value>Rap</value>
            </list>
        </property>

        <!-- Map -->
        <property name="card">
            <map>
                <entry key="身份证" value="4xxxxxxxxxxxxxxxxx"/>
                <entry key="银行卡" value="3xxxxxxxxxxxxxxxxxx"/>
            </map>
        </property>

        <!-- Set -->
        <property name="games">
            <set>
                <value>LOL</value>
                <value>DNF</value>
            </set>
        </property>

        <!--  null -->
        <property name="wife">
            <null/>
        </property>

        <!-- properties -->
        <property name="info">
            <props>
                <prop key="username">1111111</prop>
                <prop key="password">2222222</prop>
            </props>
        </property>

    </bean>
</beans>
```



### 2.3 测试

MyTest.java

```java
@Test
public void test() {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Student student = (Student) context.getBean("student");
    System.out.println(student);
}
```



## 3 拓展注入

### p命名空间 & c命名空间

实体类：User.java

```java
public class User {
    String name;
    int age;
    // 有参无参构造
    // setter
}
```

配置：userBeans.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- p命名空间 -->
    <bean id="userP" class="com.tanyiqu.pojo.User" p:name="张三" p:age="18"/>

    <!-- c命名空间 -->
    <bean id="userC" class="com.tanyiqu.pojo.User" c:name="张四" c:age="19"/>

</beans>
```

测试：MyTest.java

```java
@Test
public void testP_C(){
    ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
    User userP = context.getBean("userP", User.class);
    User userC = context.getBean("userC", User.class);
    System.out.println(userP);
    System.out.println(userC);
}
```

