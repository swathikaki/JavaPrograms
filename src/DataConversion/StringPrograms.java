package DataConversion;

public class StringPrograms {

	public static void main(String[] args) {
		
		String name = "xXtestxxXjavaxxXXHelloWorldXxx";
		String nameArr[] = name.split("xX");
		for(int i=0; i<nameArr.length; i++){
		System.out.println(nameArr[i]);  //First world will be empty as there is no string before xX
		}
		System.out.println("--------------");
		
		//Split in Selenium for test data
		String userData = "Tom;Steve;tom@gmail.com;test@123;99998;Georgia";
		
		System.out.println(userData.split(";")[0]);
		
		System.out.println(userData.split(";")[1]);
		System.out.println("--------------");
		
		//Substring
		
		String message = "your transaction id is 12345";
		System.out.println(message.substring(0, 10));
		System.out.println(message.indexOf("is"));
		
		System.out.println(message.substring(message.indexOf("is")+3, message.length()));
		
		
		
		
		
		
	}

}
