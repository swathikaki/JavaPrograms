package JavaSessions;

public class FindGreatestNumberOutOfFour {

	public static void main(String[] args) {
		
		int a=25;
		int b=78;
		int c=87;
		int d=-90;
		
		if(a>b && a>c && a>d)
			System.out.println("Greatest number is: "+a);
		else if(b>c && b>d)
			System.out.println("Greatest number is: "+b);
		else if(c>d)
			System.out.println("Greatest number is: "+c);
		else
			System.out.println("Greatest number is: "+d);
		
		
	}

}
