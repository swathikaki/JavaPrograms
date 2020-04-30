package JavaAssignments;

import java.util.ArrayList;
import java.util.List;

public class ExtractArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> colorsList = new ArrayList<String>();
				
		colorsList.add("White");
		colorsList.add("Red");
		colorsList.add("Blue");
		colorsList.add("Green");
		colorsList.add("Yellow");
		
		System.out.println("Size: "+colorsList.size());
		System.out.println("Full ArrayList");
		for(int i=0; i<colorsList.size(); i++)
			System.out.println(colorsList.get(i));
		
		//printing Array List
		System.out.println("Full list is :"+colorsList);
		
		//List<String> sbl = new List<String>();
		List<String> sbl = colorsList.subList(1,4);
		
		//printing Array List
		System.out.println("Sub list is: "+sbl);
		
		
	}

}
