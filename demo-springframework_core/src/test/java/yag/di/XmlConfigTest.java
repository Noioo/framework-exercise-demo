package yag.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import yag.di.xml.annotation_autowired.AttributeAutowiredBeanUser;
import yag.di.xml.annotation_autowired.ConstructionAutowiredBeanUser;
import yag.di.xml.annotation_autowired.SetterAutowiredBeanUser;
import yag.di.xml.annotation_qualifier.ConstructionQualifierBeanUser;
import yag.di.xml.annotation_qualifier.SetterQualifierBeanUser;
import yag.di.xml.byname_bytype.ByNameBeanUser;
import yag.di.xml.byname_bytype.ByTypeBeanUser;
import yag.di.xml.injection_bean_user.ConstructionBeanUser;
import yag.di.xml.injection_bean_user.SetterBeanUser;

@Test
public class XmlConfigTest {

    @Ignore
    public Object contextFactory(String userBeanId){
        ApplicationContext context = new ClassPathXmlApplicationContext("di/xml-config.xml");
        return context.getBean(userBeanId);
    }

    // 构造注入
    public void constructionBeanUserTest(){
        ConstructionBeanUser beanUser = (ConstructionBeanUser) contextFactory("constructionBeanUser");
        beanUser.useMethodBean();
    }
    // 设值注入
    public void setterBeanUserTest(){
        SetterBeanUser setterBeanUser = (SetterBeanUser) contextFactory("setterBeanUser");
        setterBeanUser.useMethodBean();
    }



    // byName
    public void byNameBeanUserTest(){
        ByNameBeanUser beanUser = (ByNameBeanUser)contextFactory("byNameBeanUser");
        beanUser.useMethodBean();
    }
    // byType
    public void byTypeBeanUserTest(){
        ByTypeBeanUser byTypeBeanUser = (ByTypeBeanUser) contextFactory("byTypeBeanUser");
        byTypeBeanUser.useMethodBean();
    }



    // @Autowired - 属性上
    public void attributeAutowiredBeanUserTest(){
        AttributeAutowiredBeanUser beanUser =
                (AttributeAutowiredBeanUser)contextFactory("attributeAutowiredBeanUser");
        beanUser.useMethodBean();
    }
    // @Autowired - 构造函数上
    public void constructionAutowiredBeanUserTest(){
        ConstructionAutowiredBeanUser constructionAutowiredBeanUser =
                (ConstructionAutowiredBeanUser)contextFactory("constructionAutowiredBeanUser");
        constructionAutowiredBeanUser.useMethodBean();
    }
    // @Autowired - Setter上
    public void setterAutowiredBeanUserTest(){
        SetterAutowiredBeanUser setterAutowiredBeanUser =
                (SetterAutowiredBeanUser)contextFactory("setterAutowiredBeanUser");
        setterAutowiredBeanUser.useMethodBean();
    }

    // @Qualifier - 构造函数
    public void constructionQualifierBeanUserTest(){
        ConstructionQualifierBeanUser constructionQualifierBeanUser =
                (ConstructionQualifierBeanUser)contextFactory("constructionQualifierBeanUser");
        constructionQualifierBeanUser.useBean();
    }
    // @Qualifier - Setter
    public void setterQualifierBeanUserBean(){
        SetterQualifierBeanUser setterQualifierBeanUser =
                (SetterQualifierBeanUser)contextFactory("setterQualifierBeanUser");
        setterQualifierBeanUser.useBean();

    }
}
