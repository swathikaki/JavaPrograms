package JavaSessions;

public class ConstructorConcept {

	//Class variables
		String name;
		String ceo;
		String product;
		int empCount;
		long revenue;
		static int holidayCount = 20;  //static variables
		
		public ConstructorConcept(String name, String ceo, String product, int empCount, long revenue) {
			this.name = name;
			this.ceo = ceo;
			this.product = product;
			this.empCount = empCount;
			this.revenue = revenue;
			// this.holidayCount = holidayCount; static variables 
		}




	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept("Google", "Sundhar Pichai", "Google Cloud", 13000, 1600000);
		System.out.println(obj.name);
		System.out.println(obj.ceo);
		System.out.println(obj.product);
		System.out.println(obj.empCount);
		System.out.println(obj.revenue);
		System.out.println(ConstructorConcept.holidayCount);  //Static variable access with class name
	
	
	}
	

}
