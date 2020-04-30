package InterviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheckCollections {
	 
	public static boolean isAnagram(String word, String anagram){
		
		if(!(word.length() == anagram.length()))
				return false;
		else {
			word = word.toLowerCase();
			anagram = anagram.toLowerCase();
			
			char[] charFromWord = word.toCharArray();
			char[] charFromAnagram = anagram.toCharArray();
			
			Arrays.sort(charFromWord);
			Arrays.sort(charFromAnagram);
					
			return Arrays.equals(charFromWord, charFromAnagram);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You are going to check anagram strings:- ");
		System.out.println("Enter first string:- ");
		String s1= sc.nextLine();
		System.out.println("Enter second string:- ");
		String s2= sc.nextLine();
		System.out.println(isAnagram(s1, s2) ? s1 +" and "+s2 +" are Anagrams. " : s1 +" and "+s2 +" are not Anagrams. ");
		sc.close();
	}
	
	
	
}
