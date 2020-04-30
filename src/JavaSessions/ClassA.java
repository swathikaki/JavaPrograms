package JavaSessions;

public class ClassA {

	int num = 20;
	static int var = 30;
	
	
	public static void main(String[] args) {
		
		ClassB obj = new ClassB();
		obj.sum(4,5); //regular var can accessed by creating object of that class
		ClassB.toPrint();  //Static method from different class can be accesses with class name
		System.out.println("Class B "+obj.num);
		System.out.println("Class B "+ClassB.var);
		
		ClassA ob = new ClassA();
		System.out.println("Class A "+ob.num);
		System.out.println("Class A "+ClassA.var);
	}

}
