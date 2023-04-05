package com.jsp.spring.ioc.j2ee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// to create IOC container we use J2EE container
public class Create_J2EE_Container {
public static void main(String[] args) {
	ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("j2ee.xml");
	Demo demo = (Demo)applicationContext.getBean("2");
	demo.test();
}
}
