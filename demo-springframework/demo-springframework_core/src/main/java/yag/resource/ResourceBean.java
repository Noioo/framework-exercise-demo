package yag.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class ResourceBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void getResource() throws IOException{

        Resource resource = applicationContext.getResource("resource/config.txt");
        System.out.println("文件名: " + resource.getFilename());
        System.out.println("文件URL:" + resource.getURL());
        System.out.println("文件URI:" + resource.getURI());
        System.out.println("文件描述:" + resource.getDescription());
    }
}