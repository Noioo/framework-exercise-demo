package yag.di.xml.annotation_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import yag.di.xml.MethodBean;

public class ConstructionAutowiredBeanUser {

    private MethodBean methodBean;

    @Autowired
    ConstructionAutowiredBeanUser(MethodBean methodBean){
        this.methodBean = methodBean;
    }


    public void useMethodBean(){
        methodBean.sayHelloWorld();
    }
}
