package OOInheritance;

public class BMW extends Car{
	
	//Method overriding
	@Override
	public void start(){
		System.out.println("BMW Start method");
	}
	
	public void autoParking(){
		System.out.println("BMW auto parking method");
	}

}
