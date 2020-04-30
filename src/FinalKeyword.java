
public class FinalKeyword {

	public static void main(String[] args) {
		
		final int i = 10;
		System.out.println(i);
		
		final int NumberofDaysinWeek = 7;
		
		//NumberofDaysinWeek = 20; we can't change the value of final variable
		//if the method is declared as final, no one can override the method
		//if the class is declared as final class, it can't be extended or inherited by any other class
		
		System.out.println(NumberofDaysinWeek);
		
		final String pageTitle = "Google";
		
		//pageTitle = "Facebook";  We can't modify final variable
		
		System.out.println(pageTitle);
		
	}

}
