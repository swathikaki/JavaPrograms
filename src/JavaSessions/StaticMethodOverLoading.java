package JavaSessions;

public class StaticMethodOverLoading {

	public static void getName(){
		System.out.println("0 params");
	}
	public static void getName(int a){
		System.out.println("1 params");
	}

		
	
	//JVM always starts the java program with this main method i.e with strings array as argument
	public static void main(String[] args) {
		
		StaticMethodOverLoading.getName();
		StaticMethodOverLoading.getName(4);
		
		StaticMethodOverLoading.main(7); //static methods can be called by using class name
		
		StaticMethodOverLoading.main(7,6);
	}
	
	//main method can be overloaded even though static
	public static void main(int a) {
		
		System.out.println("main method "+a);
		
	}
	
   public static void main(int a, int b) {
		
		System.out.println("main method sum"+(a+b));
		
	}
	
	

}
