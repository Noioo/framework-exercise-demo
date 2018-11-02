package yag.di.xml.annotation_autowired;


import org.springframework.beans.factory.annotation.Autowired;
import yag.di.xml.MethodBean;

public class AttributeAutowiredBeanUser {

    @Autowired
    private MethodBean methodBean;

    public void useMethodBean(){
        methodBean.sayHelloWorld();
    }
}
