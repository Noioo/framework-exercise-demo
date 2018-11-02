package yag.di.xml.byname_bytype;

import yag.di.xml.MethodBean;

public class ByNameBeanUser {

    private MethodBean methodBean;

    public void setMethodBean(MethodBean methodBean) {
        this.methodBean = methodBean;
    }

    public void useMethodBean(){
        methodBean.sayHelloWorld();
    }
}
