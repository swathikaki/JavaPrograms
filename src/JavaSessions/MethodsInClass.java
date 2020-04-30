package JavaSessions;

public class MethodsInClass {

	public void test()
	{
		System.out.println("Test method no return type");
	}
	
	public int getNumber()
	{
		System.out.println("Test method with integer as return type");
		int a = 20;
		int b = 10;
		int c = a+b;
		return c;
	}
		
	public String getName()
	{
		System.out.println("Get name method");
		String s = "Hello";
		return s;
		
	}
	 
	public int sum(int a, int b){
		System.out.println("Sum method");
		return a+b;
		
	}
	
	
	public static void main(String[] args) {
		
		MethodsInClass obj = new MethodsInClass();
		obj.test();
		
		int num = obj.getNumber();
		System.out.println(num);
		
		String str = obj.getName();
		System.out.println(str);
		
		int sum1 = obj.sum(20, 30);
		System.out.println(sum1);
	
		
		int sum2 = obj.sum(70, 100);
		System.out.println(sum2);
		
	
	}
	
	

}
