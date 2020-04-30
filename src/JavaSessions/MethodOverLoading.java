package JavaSessions;

public class MethodOverLoading {

	//method overloading
	//Same method name
	//different params
	//diff types of params
	//diff sequence of params
	
	//best examples of method overloading is Search feature, login feature, waitforelement metos in selenium
	
	public void search(){
		System.out.println("0 params");
	}
	
	public void search(int num){
		System.out.println("1 int params "+num);
	}
	
	public void search(String str){
		System.out.println("1 String params "+str);
	}
	
	public void search(String str, int num){
		System.out.println("1 String param, 1 int param "+str+" "+num);
	}
	
	public void search(int num, String str){
		System.out.println("1 int param, 1 String param "+num+" "+str);
	}
	
	
	public static void main(String[] args) {
		
		
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.search();
		obj.search(5);
		obj.search("Hello");
		obj.search(10, "Hi");
		obj.search("Hello",20);
		
		

	}

}
