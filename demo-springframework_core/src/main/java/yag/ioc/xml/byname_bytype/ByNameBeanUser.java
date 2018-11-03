package yag.ioc.xml.byname_bytype;

import yag.ioc.xml.MethodBean;

public class ByNameBeanUser {

    private MethodBean methodBean;

    public void setMethodBean(MethodBean methodBean) {
        this.methodBean = methodBean;
    }

    public void useMethodBean(){
        methodBean.sayHelloWorld();
    }
}
