package DataConversion;

public class StringReverse {

	//Method to reverse the string
	
	public static String stringRev(String str)
	{
		int len = str.length();
		if(len==1) return str;  //If len =1 retuen the same string without reversing
		
		String revStr = "";
		
		for(int i=len-1; i>=0; i--){
			revStr = revStr + str.charAt(i);
			
		}
		return revStr;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(stringRev("Selenium"));  //need to reverse the string "muineleS"
		System.out.println(stringRev("12345"));
		System.out.println(stringRev("TTT"));
		System.out.println(stringRev(" "));
		System.out.println(stringRev("T"));
		
		
		}

}
