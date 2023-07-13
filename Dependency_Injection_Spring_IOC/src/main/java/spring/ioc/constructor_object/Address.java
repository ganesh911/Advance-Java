package spring.ioc.constructor_object;

public class Address {
	private int id ;
	private String city ;
	private int pCode ;
	public Address(int id, String city, int pCode) {
		this.id = id;
		this.city = city;
		this.pCode = pCode;
	}
	
	public void display() {
		System.out.println("id:"+id+" ,City: "+city+" ,Pin code: "+pCode);
	}
	
}
