package yag.resource;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/resource-beans.xml");
        ResourceBean resourceBean = (ResourceBean)context.getBean("myResource");
        resourceBean.getResource();
    }
}
