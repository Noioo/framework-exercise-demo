package yag.ioc.xml.injection_bean_user;

import yag.ioc.xml.MethodBean;

public class ConstructionBeanUser {

    private MethodBean methodBean;

    public ConstructionBeanUser(MethodBean methodBean){
        this.methodBean = methodBean;
    }

    public void useMethodBean(){
        methodBean.sayHelloWorld();
    }
}
