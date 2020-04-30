package InterviewPrograms;

import java.util.Scanner;

public class AnagramStrings {

	public static boolean areAnagramsUsingIteration(String first, String second)
	{
		// Length must be same. Return false if not.
		if(first.length() != second.length())
			return false;
		
		// Converting both strings in to same case
		first= first.toLowerCase();
		second= second.toLowerCase();
		
		// Iterate first string
		for(int i =0 ; i<first.length() ;i++)
		{
			// Extracting char of first string at iterating index
			String c = Character.toString(first.charAt(i));
			// If second string does not contain extracted char, exit
			if(!(second.contains(c)))
			return false;
			// Remove all occurrences of checked char
			else
			{
				first= first.replace(c, "");
				second = second.replace(c, "");
				// This condition will eliminate unnecessary iteration 
				// Length must be same after replacing from both. Return false if not.
				if(first.length() != second.length())
					return false;
			}
		}
		return true;
				
	}
 
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("You are going to check anagram strings:- ");
		System.out.println("Enter first string:- ");
		String s1= sc.nextLine();
		System.out.println("Enter second string:- ");
		String s2= sc.nextLine();
		System.out.println(areAnagramsUsingIteration(s1, s2) ? s1 +" and "+s2 +" are Anagrams. " : s1 +" and "+s2 +" are not Anagrams. ");
		sc.close();
	}

}
