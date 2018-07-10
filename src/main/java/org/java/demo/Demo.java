package org.java.demo;

import org.java.config.AppConfig;
import org.java.service.InfService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 马果 on 2018/7/9.
 */
public class Demo {

    public static void main(String[] args) {
        ApplicationContext cxf = new AnnotationConfigApplicationContext(AppConfig.class);
        InfService infService =(InfService) cxf.getBean("infService");
        infService.add();;
        System.out.println("######");
    }
}
