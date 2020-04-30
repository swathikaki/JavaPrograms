package DataConversion;

public class DataConversionConcept {

	public static void main(String[] args) {
		
		//String to int
		String x = "100";
		System.out.println(x+20);
		
		//120
		//Wrapper Class
		int i = Integer.parseInt(x); //100
		System.out.println(i+20);
		
		String total = "1000A";
		System.out.println(total+50);
		
		//int totalVal = Integer.parseInt(total);
		//System.out.println(totalVal);
		
		String y = "122.40";
		System.out.println(y+20);
		
		double d = Double.parseDouble(y) + 20;  //String to Double
		System.out.println(d);
		
		//int to string
		int p = 200;
		System.out.println(p+50);
		String str = String.valueOf(p);  //Int 
		System.out.println(str+20);
		
		//Boolean to String
		String test = String.valueOf(true);  //Int 
		System.out.println(test + "Hello");

	}

}
