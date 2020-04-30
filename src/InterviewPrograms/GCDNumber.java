package InterviewPrograms;

import java.util.Scanner;

public class GCDNumber {
	
	private static int findGCD(int num1, int num2){
		
		if(num2 == 0)
			return num1;
		
		return findGCD(num2, num1%num2);
		
		
	}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You are going to check anagram strings:- ");
		System.out.println("Enter first Number:- ");
		int num1 = sc.nextInt();
		System.out.println("Enter second Number:- ");
		int num2= sc.nextInt();
		System.out.println("GCD of given numbers is: "+ findGCD(num1, num2));
		sc.close();
	}
	
	

}
