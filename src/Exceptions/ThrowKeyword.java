package Exceptions;

public class ThrowKeyword {

	
	public static void main(String[] args) {
		
		try{
		throw new Exception("SwathiException");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

}
