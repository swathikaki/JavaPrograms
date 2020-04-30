package JavaAssignments;

import java.util.ArrayList;

public class RemoveArrayListItems {

	public static void main(String[] args) {
		
		ArrayList<String> colorsList = new ArrayList<String>();
		colorsList.add("White");
		colorsList.add("Red");
		colorsList.add("Blue");
		colorsList.add("Green");
		
		System.out.println("ArrayList size: "+colorsList.size());
		
		//To print all elements of an arrayList using the position of the elements
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
		
		
		//To trim the virtual capacity of an array list to the current list size
		colorsList.trimToSize();
		
		//Removing all items from ArrayList
		
		colorsList.removeAll(colorsList);
		System.out.println(colorsList);

	}

}
