package JavaSessions;

import java.util.ArrayList;

public class GetMarksMethod {

	
	public int getMarks(String studentName){
		int marks = -1;
		
		if(studentName.equals("Swathi")){
			marks = 90;
		}
		
		else if(studentName.equals("Nidhi")){
			marks = 100;
		}
		
		else if(studentName.equals("Nithya")){
			marks = 70;
		}
		
		else{
			System.out.println("Student name not found "+studentName);
			}
		
		return marks;
				
		}
	
	public ArrayList<String> getEmployeeList(String companyName){
		
		ArrayList<String> compList = new ArrayList<String>();
		
		if(companyName.equals("IBM")){
			compList.add("Swathi");
			compList.add("Nidhi");
			compList.add("Nithya");
		}
		else if(companyName.equals("Ingenico")){
			compList.add("Yug");
			compList.add("Tom");
		}
		else if(companyName.equals("Fiserv")){
			compList.add("Kavi");
			compList.add("Rich");
		}
			
		else{
				System.out.println("Match not found for "+companyName);
			}
		
		return compList;
		
	}
	
		
	
	public static void main(String[] args) {
		
		GetMarksMethod obj = new GetMarksMethod();
		int m = obj.getMarks("Nidhi");
		System.out.println(m);
		
		ArrayList<String> empList = new ArrayList<String>();
		empList = obj.getEmployeeList("MS");
		System.out.println(empList);
		
		empList = obj.getEmployeeList("Ingenico");
		System.out.println(empList);
		
	}

}
