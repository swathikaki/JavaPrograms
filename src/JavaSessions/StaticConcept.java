package JavaSessions;

public class StaticConcept {

	//Car Class
	String name;
	String model;
	int price;
	static int wheels = 4; //wheels will be same for all car models so declared as static, only one instance will be saved
	
	
	public static void main(String[] args) {
		
		StaticConcept c1 = new StaticConcept();
		c1.name = "Honda";
		c1.model = "Civic";
		c1.price = 25000;
		
		StaticConcept c2 = new StaticConcept();
		c2.name = "Toyota";
		c2.model = "Corolla";
		c2.price = 18000;

		System.out.println("Honda details: "+c1.name+" "+c1.model+" "+c1.price+" "+StaticConcept.wheels);
		System.out.println("Toyota details: "+c2.name+" "+c2.model+" "+c2.price+" "+StaticConcept.wheels);
		
	}

}
