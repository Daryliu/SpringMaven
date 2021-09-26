package com.ldy.ldyConfig;

import com.ldy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration代表这是一个配置类，就和之前看的beaans.xml是一样的
@Configuration      //其也会被Spring容器托管，注册到容器中，因为其本身也是一个@Component
@ComponentScan("com.ldy.pojo")
@Import(config2.class)

public class ldyConfig {
    //等价于xml中写的一个bean标签；
    //方法的getUser名字就相当于bean标签中的id属性
    //返回值相当于bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();
    }

}
