package com.tanyiqu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// 等价于注册了一个bean
@Component
@Scope(value="singleton")
public class User {

    @Value("张四")
    String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Value("张四")
    public void setName(String name) {
        this.name = name;
    }
}
