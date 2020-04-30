package JavaSessions;

public class StaticExample {

	//Class variables
	String name;
	static int age = 30;
	
	public void getName(){
		System.out.println("getname method");
		
	}
	
	public static void getValue(){
		System.out.println("getvalue method");
		
	}
	
	public static void main(String[] args) {
		
		//method variables
		int i = 10;   //static is only for class variables
		System.out.println(i); 
		
		StaticExample obj = new StaticExample();
		obj.name = "Tom";
		obj.getName();
		
		//obj.age = 25;  // not a good way of accessing static variable
		System.out.println(age); /// Age is static variable which can be called directly
		getValue();
		
		//Calling static variables using class name  is always  Preferred method
		System.out.println(StaticExample.age); /// Age is static variable which can be also called by using Class name 
		StaticExample.getValue();
		

	}

}
