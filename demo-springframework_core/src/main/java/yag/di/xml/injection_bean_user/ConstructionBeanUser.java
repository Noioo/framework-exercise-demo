package yag.di.xml.injection_bean_user;

import yag.di.xml.MethodBean;

public class ConstructionBeanUser {

    private MethodBean methodBean;

    public ConstructionBeanUser(MethodBean methodBean){
        this.methodBean = methodBean;
    }

    public void useMethodBean(){
        methodBean.sayHelloWorld();
    }
}
