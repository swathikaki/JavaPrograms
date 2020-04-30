package JavaSessions;

public class ForLoopPgm {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		for(int d=1; d<=20; d++){
			if(d%2==0)
				System.out.println(d);
		}
		
		
		for(int k=10; k>=1; k--)
		{
			System.out.println(k);
		}
		System.out.println("---------------");
		System.out.println("Program to print Even numbers");			
		for(int m=2; m<=10; m=m+2)
		{
			System.out.println(m);
		}
		
		
		//Infinite loop
//		for(; ;)
//			System.out.println("Hello");
//		
		
	}
	
}
