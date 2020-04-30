package DataConversion;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str = "This is my first java code Hello World";
		
		System.out.println(str.length());
		System.out.println("Lowest Index is 0");
		System.out.println("Hoghest Index is: " + (str.length()-1));
		
		System.out.println(str.charAt(5));
		//System.out.println(str.charAt(38));  //StringIndexOutOfBound Exception
		  
		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('s'));  //1st Occurance of char S
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));  //1st Occurance of char S
		
		System.out.println(str.indexOf("java")); //Index of String occurance
		System.out.println(str.indexOf("swathi")); //  returns -1 as string is not present
		
		String welcome = "welcome admin";
		if(welcome.indexOf("admin")>0){
			System.out.println("Admin is present in Sting");
			
		}
		else{
			System.out.println("Admin is not present in Sting");
		}
		
		//trim method
		String s = "    Swathi    ";
		System.out.println(s);
		System.out.println(s.trim());  //remove spaces starting and ending
		
		//Replace
		String s1 = "    Hello java    ";
		System.out.println(s1);
		System.out.println(s1.trim().replace(" ", ""));
		
		String dob = "10-10-2020";
		System.out.println(dob);
		System.out.println(dob.replace("-","/"));
		
		//Comparison
		String br = "chrome";
		String br1 = "Chrome";
		System.out.println(br.equals(br1));
		System.out.println(br.equalsIgnoreCase(br1));
		
		//Contains
		String msg = "    Welcome to Java world";
		
		System.out.println(msg.trim().contains("Java"));  //returns true if string is found
		
		//Split
		String lang = "Java_Python_Ruby_JavaScript";
		String langVal[] = lang.split("_");   //Splitting the string based on _ symbol
		System.out.println(langVal.length);
		
		for(int i=0; i<langVal.length; i++){
			System.out.println(langVal[i]);
		}
		
		//Cases
		String val = "This is Java Code";
		System.out.println(val.toUpperCase());
		System.out.println(val.toLowerCase());
		
	}

}
