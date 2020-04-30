package JavaSessions;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		//ArrayList is default class in Java, It is  a dynamic Array
		//create the object of ArrayList class;
		
		ArrayList ar = new ArrayList();
		// default virtual memory size is of ArrayList is 10
		System.out.println("Size of ArrayList: "+ar.size()); //always give 0 which is the physical memory size
		
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
		ar.add(800);
		ar.add(600);
		System.out.println(ar.size());
		
		ar.remove(3);
		System.out.println(ar.size());
		
		for(int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
		
		//System.out.println(ar.get(6));  //Index Out OfBound Exception, trying to access index which is not existed
		
		ar.add("Selenium"); //we can store different types of data
		ar.add(true);
		ar.add(16.789);
		ar.add("Selenium");
		System.out.println("New ArrayList items: ");
		for(int i=0; i<ar.size(); i++)   // Static Array .length,  Dynamic Array .size()
			System.out.println(ar.get(i));
		
		
		
		
		
	}

}
