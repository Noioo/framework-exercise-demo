package yag.ioc.java.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import yag.ioc.java.HelloWorldBean;

// 基于JavaConfig的Setter注入
@Configuration
public class BeanUser {

    private HelloWorldBean helloWorldBean;

    @Autowired
    public void setHelloWorldBean(HelloWorldBean helloWorldBean) {
        this.helloWorldBean = helloWorldBean;
    }

    public void useBean(){
        helloWorldBean.sayHelloWorld();
    }
}
