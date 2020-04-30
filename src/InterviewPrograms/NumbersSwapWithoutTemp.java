package InterviewPrograms;

public class NumbersSwapWithoutTemp {
	
	public static void main(String args[]) { 
		
		int a = 10; int b = 20;
		
		System.out.println("Before Swap: A is " + a + " and B is " + b);
		
		//technique 1
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Tech 1 After Swap: A is " + a + " and B is " + b);
		
		//technique 2
		a = (a+b) - (b=a);
		
		System.out.println("Tech 2 After Swap: A is " + a + " and B is " + b);
		
		//technique 3
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("Tech 3 After Swap: A is " + a + " and B is " + b);
		
	}


}
