package OOInterface;

public class College implements Medical, NonMedical, Commerce {
	
	//Medical Interface
	public void biology(){
		System.out.println("College class biology method");
	}
	
	public void science(){
		System.out.println("College class Science method");
	}
	
	public void mathematics(){
		System.out.println("College class Mathemetics method");
	}
	
	//Non Medical Interface
	
	//Commerce Interface
	public void economics(){
		System.out.println("College class Economics method");
	}

}
