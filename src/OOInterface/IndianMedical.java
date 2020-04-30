package OOInterface;

public interface IndianMedical {
	
	public void OPTServices();
	
	public void CardioServices();
	
	//after jdk 1.8: Method body is allowed in Interface
	
	//Static method is allowed with method body
	
	public static void bloodBank(){
				System.out.println("Static method bloodBank");	
	}
	
	
	//Default method  //it can be overriden in the class which implements this interface
	default void FDA(){
		System.out.println("default method FDA");
	}
	

}
