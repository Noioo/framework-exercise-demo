package yag.di.java.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yag.di.java.HelloWorld;

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
