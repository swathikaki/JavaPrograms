package OOAbstract;

public abstract class Page {
	
	public Page(){  //when we create child class object, parent class constructor will be called
		System.out.println("Abstract class DEfault constructor");
	}
	
	
	public abstract void header();
	
	public abstract void title();
	
	public void search(){
		System.out.println("Abstract class Search method");
	}
	

}
