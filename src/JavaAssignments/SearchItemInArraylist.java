package JavaAssignments;

import java.util.ArrayList;

public class SearchItemInArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> colorsList = new ArrayList<String>();
		colorsList.add("White");
		colorsList.add("Red");
		colorsList.add("Blue");
		colorsList.add("Green");
		
		System.out.println("ArrayList size: "+colorsList.size());
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
		
		
		//To search an element in ArrayList easy method
		if(colorsList.contains("Blue"))
			System.out.println("Blue is there");
		else
			System.out.println("Blue is not there");
		
		
		
		boolean f=true;
		//System.out.println((colorsList.get(0).compareTo("Red")));
			
		for(int i=0; i<colorsList.size(); i++)
		{
			
			//if((colorsList.get(i).equals("Red"))   ///By using equals method to compare the strings, returns True or False
			if((colorsList.get(i).compareTo("Red"))==0)   //By using compareTo method to compare 2 strings, returns 0 or any integer
			{
			System.out.println("match found "+colorsList.get(i));
			f=true;
			break;
			}
			else
				f=false;
				//System.out.println("match not found");
		}
		if(!f)
			System.out.println("match not found");
		
		//By using Ternary operator
		
		System.out.println((f==false)?"match not found":"match found");
	}

	
	
	
	
}
