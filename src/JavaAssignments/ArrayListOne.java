package JavaAssignments;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {
		
		ArrayList<String> colorsList = new ArrayList<String>();
		colorsList.add("White");
		colorsList.add("Red");
		colorsList.add("Blue");
		colorsList.add("Green");
		
		System.out.println("Size: "+colorsList.size());
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
		
		
		//Updated ColorsList
		
		colorsList.add(0,"Black"); //To insert an element at the beginning of ArrayList
		colorsList.add(colorsList.size(),"Brown"); //To insert an element at the end of the ArrayList
		
		System.out.println("Updated Size: "+colorsList.size());
		System.out.println("Updated Colors list");
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
		
		//To retrieve an element from an ArrayList with specified index
		System.out.println(colorsList.get(4));
		
		//To insert an element in an ArrayList at a specified index
		colorsList.set(3,"Maroon");
		System.out.println("Updated Size after inserting a new element: "+colorsList.size());
		System.out.println("Updated Colors list after inserting ");
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
		
		
		//To remove an element from a specified index
		colorsList.remove(2);
		System.out.println("Updated Size after removing: "+colorsList.size());
		System.out.println("Updated Colors list after removing");
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
		
		
		
	}

}
