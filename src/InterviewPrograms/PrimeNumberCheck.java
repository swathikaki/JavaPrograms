package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check its prime or not: ");
		int num=sc.nextInt();
		System.out.println(primenum(num));
		sc.close();
		}
	
		private static boolean primenum(int num)
		{
		boolean isprime=true;
		if(num==2||num==3)
		{
		return isprime;
		}
		if(num%2==0)
		{
		return isprime=false;
		}
		for(int i=3;i<num;i+=2)
		{
		if(num%i==0)
		{
		return isprime=false;
		}
		}
		return isprime;

		}
}
