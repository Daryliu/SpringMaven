package com.ldy.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//说明这个类被Spring接管，注册到容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("刘德昱")   //属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
