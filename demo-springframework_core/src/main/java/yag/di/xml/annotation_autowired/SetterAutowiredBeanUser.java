package yag.di.xml.annotation_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import yag.di.xml.MethodBean;

public class SetterAutowiredBeanUser {

    private MethodBean methodBean;

    @Autowired
    public void setMethodBean(MethodBean methodBean) {
        this.methodBean = methodBean;
    }

    public void useMethodBean(){
        methodBean.sayHelloWorld();
    }
}
