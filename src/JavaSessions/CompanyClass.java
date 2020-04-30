package JavaSessions;

public class CompanyClass {
	//Class variables
	String name;
	String ceo;
	String product;
	int empCount;
	long revenue;
	
	//Constructors of class
	//Name should be class name
	//Can't return any value
	//looks like a function but not a function
	
	public CompanyClass(){
		System.out.println("Default constructor");
	}
	
	public CompanyClass(int a){
		System.out.println("one param constructor");
	}
	
	//Create constructor with class variables
	public CompanyClass(String name, String ceo, String product, int empCount, long revenue){
		//name = name1; //not a good approach
		this.name = name;
		this.ceo = ceo;
		this.product = product;
		this.empCount = empCount;
		this.revenue = revenue;
		System.out.println("multiple param constructor");
	}
	
public CompanyClass(String name, int empCount){
		this.name = name;
		this.empCount = empCount;
		System.out.println("2 param constructor");
	}
	
	public static void main(String[] args) {
		
		CompanyClass obj1 = new CompanyClass(); //Default constructor will be called
		CompanyClass obj2 = new CompanyClass(6); //Int param constructor will be called
		CompanyClass obj3 = new CompanyClass("Google", "Sundhar Pichai", "Google Cloud", 13000, 1600000); //multiple param constructor will be called
		
		System.out.println(obj3.name);
		System.out.println(obj3.ceo);
		System.out.println(obj3.product);
		System.out.println(obj3.empCount);
		System.out.println(obj3.revenue);
		
		CompanyClass obj4 = new CompanyClass("Microsoft", "Sathya Nadella", "Microsoft Azure", 18000, 1200000); //Int param constructor will be called
		
		System.out.println(obj4.name);
		System.out.println(obj4.ceo);
		System.out.println(obj4.product);
		System.out.println(obj4.empCount);
		System.out.println(obj4.revenue);
		
CompanyClass obj5 = new CompanyClass("Samsung",6000); //2 param constructor will be called
		
		System.out.println(obj5.name);
		System.out.println(obj5.empCount);
				
	}

}
