package com.jsp.field_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
class EMF{
	public void getEMF() {
		System.out.println("object");
		
	}
}

public class CreateEMF {
 public static void main(String[] args) {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
	EMF eMF = (EMF)applicationContext.getBean("create");
	eMF.getEMF();
}
}
