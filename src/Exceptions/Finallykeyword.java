package Exceptions;

public class Finallykeyword {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try{
			int i = 9/0;
			
		}catch(Exception e){
			System.out.println("divide by zero");
		}
		
		finally{
			System.out.println("Finally block");
		}
		

	}

}
