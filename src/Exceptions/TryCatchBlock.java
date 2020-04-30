package Exceptions;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		
		System.out.println("A");
		System.out.println("A");
		
		try{
			//int i = 9/0;  //Exception line
			int i = 9/3;   //No Exception
			System.out.println("ABC");  //it will not print this SOP as control will move to Catch block after execption
		int p[] = new int[2];
		p[0] = 10;
		p[1] = 20;
		p[2] = 30;
		
		
		
		}
		//catch(Error e){ //e is the reference of exception or Error class
			catch(Exception e){
			System.out.println("Arithematic Exception");
			System.out.println(e.getMessage()); //To print the reason for exception
			e.printStackTrace();  //To print the details of Exception, where exactly the exception is, line number
		}
	catch(Throwable e){   //Throwable is the parent class of Error and Exception
		System.out.println("Throwable Exception");
	}
		
		System.out.println("A");
		System.out.println("A");

	}

}
