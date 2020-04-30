package JavaSessions;

import java.util.ArrayList;

public class Student {
	String name;
	int age;
	int id;
	ArrayList<String> Courses;
	
		
	public Student(String name, int age, int id, ArrayList<String> Courses) {
		
		this.name = name;
		this.age = age;
		this.id = id;
		this.Courses = Courses;
	}


	public static void main(String[] args) {
		
		//Student s1 = new Student("Swathi", 24, 234);
		//Student s2 = new Student("Nithya", 21, 235);
		
		ArrayList<String> CourseList = new ArrayList<String>();
		CourseList.add("ECE");
		CourseList.add("CSE");
		CourseList.add("CSIT");
		CourseList.add("Civil");
		
		Student s3 = new Student("Nidhi", 20, 236, CourseList);
		
		//System.out.println(s1.name + " " + s1.age + " " + s1.id);
		//System.out.println(s2.name + " " + s2.age + " " + s2.id);
		System.out.println(s3.name + " " + s3.age + " " + s3.id + " " + s3.CourseList);
		
		//s1 = s2;  //reference transferring
		
		System.out.println("After assigning s1 to s2");
		System.out.println(s1.name + " " + s1.age + " " + s1.id);
		System.out.println(s2.name + " " + s2.age + " " + s2.id);
		System.out.println(s3.name + " " + s3.age + " " + s3.id);
		
		s2 = s3; //S2 is pointing to s3
		
		System.out.println("After assigning s2 to s3");
		System.out.println(s1.name + " " + s1.age + " " + s1.id);
		System.out.println(s2.name + " " + s2.age + " " + s2.id);
		System.out.println(s3.name + " " + s3.age + " " + s3.id);
		
		s3 = s1; //Now s3 is pointing to s1 which is already pointing to s2, so s3 will get s2 values
		
		System.out.println("After assigning s3 to s1");
		System.out.println(s1.name + " " + s1.age + " " + s1.id);
		System.out.println(s2.name + " " + s2.age + " " + s2.id);
		System.out.println(s3.name + " " + s3.age + " " + s3.id);
		

	}

}
