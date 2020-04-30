package JavaSessions;

import java.util.ArrayList;

public class InegerArrayList {

	public static void main(String[] args) {
		
		//Integer Array List
		ArrayList<Integer> marksList = new ArrayList<Integer>();  //which can store unlimited Integer data
		marksList.add(35);
		marksList.add(70);
		marksList.add(90);
		System.out.println("marksList size: "+marksList.size());
		for(int i=0; i<marksList.size(); i++)
			System.out.println(marksList.get(i));
		

		//String Array List
		ArrayList<String> studentList = new ArrayList<String>();  //which can store unlimited String data
		studentList.add("Swathi");
		studentList.add("Nithya");
		studentList.add("Nidhi");
		System.out.println("studentList size: "+studentList.size());
		for(int i=0; i<studentList.size(); i++)
			System.out.println(studentList.get(i));
		
		//ArrayList which can store any type of data without warning
		
		ArrayList<Object> empList = new ArrayList<Object>();  //which can store unlimited data of any type
		
		empList.add("Tom");
		empList.add("25");
		empList.add('m');
		empList.add(true);
		System.out.println("empList size: "+empList.size());
		for(int i=0; i<empList.size(); i++)
			System.out.println(empList.get(i));
		
		
		
		
		
		
		
		
	}

}
