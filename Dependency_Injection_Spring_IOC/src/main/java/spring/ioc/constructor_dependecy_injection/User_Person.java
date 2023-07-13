package spring.ioc.constructor_dependecy_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User_Person {
	public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("first_constructor.xml");
	Person person = (Person)applicationContext.getBean("1");

	person.display();
	}
}
