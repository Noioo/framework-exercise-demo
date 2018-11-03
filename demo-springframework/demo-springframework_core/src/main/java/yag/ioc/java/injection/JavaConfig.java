package yag.ioc.java.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yag.ioc.java.HelloWorldBean;

@Configuration
public class JavaConfig {

    // Bean定义
    @Bean
    public HelloWorldBean helloWorld(){
        return new HelloWorldBean();
    }

    @Bean(name = "AAA")
    public BeanUser beanUser(){
        return new BeanUser();
    }

}
