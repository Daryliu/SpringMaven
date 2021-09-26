package com.ldy.ldyConfig;

import com.ldy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      //其也会被Spring容器托管，注册到容器中，因为其本身也是一个@Component
@ComponentScan("com.ldy.pojo")
public class config2 {
    @Bean
    public User getUser() {
        return new User();
    }
}
