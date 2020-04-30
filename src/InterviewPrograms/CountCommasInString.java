package InterviewPrograms;

public class CountCommasInString {

	public static void main(String[] args) {
		
		String str="swathi,,,kaki,,,,";
		
		int count=0;
		
		System.out.println("str length is: "+str.length());
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			//System.out.println("Char is: "+ch);
			if(ch==',')
				count++;
		}
		
		System.out.println("Number of Commas in the string are: "+count);
		
		//2nd method
		int firstLen=str.length();
		int secondLen=0;
		String newStr;
		
		newStr= str.replace(",", "");
		secondLen=newStr.length();
		
			System.out.println("String is: "+str+" and length is: "+firstLen);
			System.out.println("New string is: "+newStr+" and length is: "+secondLen);
			System.out.println("Number of Commas are: "+(firstLen-secondLen));
			
		
		System.out.println("Number of Commas in the string are: "+(str.length()-str.replace(",", "").length()));
		

	}

}
