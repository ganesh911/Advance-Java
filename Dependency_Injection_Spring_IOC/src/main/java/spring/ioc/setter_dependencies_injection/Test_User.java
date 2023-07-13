package spring.ioc.setter_dependencies_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test_User {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user_set.xml");
		User user1 = (User)applicationContext.getBean("1");
		user1.display();
	}
}
