package FinallyBlock;

public class FinallConcept {

	public static void main(String[] args) {
		
		System.out.println(div(10,0));
		
	}

	public static int div(int a, int b){
		int d = 0;
		
		try{
			d = a/b;
			System.out.println("Hi");
			System.out.println("Hello");
			return d;
		} catch (Exception e){
			System.out.println("Exception is coming");
			return d;
		}
		finally{
			System.out.println("in side finally block");
			return -1;
		}
		
	}
	
}
