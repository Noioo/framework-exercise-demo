package yag.di.xml.injection_bean_user;


import yag.di.xml.MethodBean;

// 利用Setter进行注入
public class SetterBeanUser {

    private MethodBean methodBean;


    public void setMethodBean(MethodBean methodBean) {
        this.methodBean = methodBean;
    }

    public void useMethodBean(){
        methodBean.sayHelloWorld();
    }
}
