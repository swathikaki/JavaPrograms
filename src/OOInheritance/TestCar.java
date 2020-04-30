package OOInheritance;

public class TestCar {

	
	
	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //Child class method BMW  //Method  Override
		b.stop();  ///Parent method
		b.refuel(); //Parent method
		b.autoParking(); //Child class BMW method
		b.engine();  //Grand parent method
		
		Audi a = new Audi();
		a.start(); //Child class method BMW  //Method  Override
		a.stop();  ///Parent method
		a.refuel(); //Parent method
		//a.autoParking(); //Child class BMW method can't access from another child class object
		a.engine();  //Grand parent method
		a.quadQ4();  //Audi class

		Car c = new Car();
		c.start(); //Parent class method  
		c.stop();  ///Parent method
		c.refuel(); //Parent method
		c.engine(); //Parent method
			// we can't call aotoParking method as it is Child class method, parent can't access
		
		//TOP Casting or UP Casting
		Car c1 = new BMW(); //Child class object can be referred by parent class ref var
		c1.start();  //child class
		c1.stop();  //parent class
		c1.refuel();  //parent class
		//c1.autoParking();  //reference check mechanism  //
		
		Vehicle v1 = new BMW(); //TOP Casting
		v1.engine();
	
		
		//Down Casting  is not allowed in Java
//		BMW b1 = (BMW) new Car();  //ClassCastException will occur
//		b1.start();
//		b1.stop();
//		b1.refuel();
//		b1.autoParking();
		
		
	
	}
	

}
