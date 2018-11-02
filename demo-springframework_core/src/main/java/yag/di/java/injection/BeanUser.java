package yag.di.java.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import yag.di.java.HelloWorld;

// 基于JavaConfig的Setter注入
@Configuration
public class BeanUser {

    private HelloWorld helloWorld;

    @Autowired
    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void useBean(){
        helloWorld.sayHelloWorld();
    }
}
