package yag.di.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yag.di.java.HelloWorld;
import yag.di.java.injection.BeanUser;

@Configuration
public class JavaConfig {

    // Bean定义
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean(name = "AAA")
    public BeanUser beanUser(){
        return new BeanUser();
    }

}
