package yag.ioc.xml.annotation_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import yag.ioc.xml.PojoBean;

public class SetterQualifierBeanUser {

    private PojoBean pojoBean;

    @Autowired
    @Qualifier(value = "want")
    public void setPojoBean(PojoBean pojoBean) {
        this.pojoBean = pojoBean;
    }

    public void useBean(){
        System.out.println(pojoBean.getTheStringValue());
    }
}
