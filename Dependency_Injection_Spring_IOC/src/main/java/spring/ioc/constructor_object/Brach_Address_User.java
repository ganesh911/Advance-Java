package spring.ioc.constructor_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Brach_Address_User {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("branch_address.xml");
		 Branch branch = (Branch)applicationContext.getBean("branch");
		 branch.address.display();
	}
}
 