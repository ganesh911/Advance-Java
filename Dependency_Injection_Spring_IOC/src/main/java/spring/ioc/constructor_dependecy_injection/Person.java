package spring.ioc.constructor_dependecy_injection;
public class Person {
	int id ;
	String name ;
	Person(int id , String name){
		this.id = id ;
		this.name = name ;
	}
	public void display() {
		System.out.println("Id : "+ id);
		System.out.println("Name  : "+ name);
	}

	
}
