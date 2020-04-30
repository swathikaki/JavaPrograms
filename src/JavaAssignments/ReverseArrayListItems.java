package JavaAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListItems {

	public static void main(String[] args) {
		
		ArrayList<String> colorsList = new ArrayList<String>();
		ArrayList<String> colorsListREV = new ArrayList<String>();
		
		colorsList.add("White");
		colorsList.add("Red");
		colorsList.add("Blue");
		colorsList.add("Green");
		colorsList.add("Yellow");
		
		System.out.println("Size: "+colorsList.size());
		System.out.println("Before reverse");
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
	
		//In build method to reverse the ArrayList
		Collections.reverse(colorsList);
		
		System.out.println("After reverse by using Collections.reverse method");
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
		
		
		for(int i=colorsList.size()-1; i>=0; i--)
		{
			colorsListREV.add(colorsList.get(i));
		}
	
		for(int i=colorsList.size()-1,j=0; i>=(colorsList.size()/2); i--,j++)
		{
			String temp;
			temp=colorsList.get(j);
			colorsList.set(j,colorsList.get(i));
			colorsList.set(i,temp);
		}
		System.out.println("After reversing using for loop logic ....");
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
	
//			System.out.println("After reverse"); //To just print the Arraylist items in Reverse order
//		for(int i=colorsList.size()-1; i>=0; i--)
//			System.out.println(colorsList.get(i));
//		
		System.out.println("After reverse");
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsListREV.get(i));
	}

}
