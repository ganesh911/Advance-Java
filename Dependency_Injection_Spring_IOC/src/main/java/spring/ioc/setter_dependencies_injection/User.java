package spring.ioc.setter_dependencies_injection;
public class User {
	private int id ;
	private String name ;
	private String add ;
	private String email ;
	private String password ;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void display() {
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :"+add);
		System.out.println("Email :"+email);
		System.out.println("Password :"+password);
	}
}
