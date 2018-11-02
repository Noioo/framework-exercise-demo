package yag.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import yag.di.java.config.JavaConfig;
import yag.di.java.injection.BeanUser;

@Test
public class JavaConfigTest {
//
//    private ApplicationContext contextFactory(Object beanUser){
//        ApplicationContext context = new AnnotationConfigApplicationContext(beanUser.getClass());
//        context.getBean()
//    }

    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        BeanUser beanUser = (BeanUser)context.getBean("AAA");
        beanUser.useBean();
    }
}
