package spring.ioc.setter_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Music {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car_music.xml");
		Car car1 = (Car)applicationContext.getBean("car1");
		car1.run();
	}
}
