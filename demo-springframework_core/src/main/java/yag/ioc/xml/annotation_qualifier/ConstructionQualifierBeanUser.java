package yag.ioc.xml.annotation_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import yag.ioc.xml.PojoBean;

public class ConstructionQualifierBeanUser {

    private PojoBean pojoBean;

    @Autowired
    public ConstructionQualifierBeanUser(@Qualifier(value = "want") PojoBean pojoBean){
        this.pojoBean = pojoBean;
    }

    public void useBean(){
        System.out.println(pojoBean.getTheStringValue());
    }
}
