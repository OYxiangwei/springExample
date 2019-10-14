package com.spring.demo;


import com.spring.demo.helloworld.HelloWorld;
import com.spring.demo.loosely_coupled.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    private static ApplicationContext context;

    public static void main(String[] args) {
       // context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        //HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        //obj.printHello();


        context = new ClassPathXmlApplicationContext("Spring-Output.xml");
        OutputHelper helperBean = (OutputHelper) context.getBean("OutputHelperBean");
        helperBean.generatorOutput();
    }
}
