package AccessModifiers;

public class Car {
	
	public String name;
	private String ChasisNumber;
	String color;   //default  access modifier
	protected int price;
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "Audi";
		c.ChasisNumber = "123456";
		c.price = 200000;
		c.color = "Red";
			
		
	}
	

}
