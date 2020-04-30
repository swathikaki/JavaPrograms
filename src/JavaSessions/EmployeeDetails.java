package JavaSessions;

public class EmployeeDetails {

	String name;
	int age;
	String role;
	int empID;
	boolean isPermanent;
		
		
	public static void main(String[] args) {
		
		//creating an object of EmployeeDetails class
		
		EmployeeDetails emp1 = new EmployeeDetails();
		EmployeeDetails emp2 = new EmployeeDetails();
		
		emp1.name = "Swathi";
		emp1.age = 30;
		emp1.role = "Developer";
		emp1.empID = 1235;
		emp1.isPermanent = true;
		
		emp2.name = "Nidhi";
		emp2.age = 35;
		emp2.role = "QA";
		emp2.empID = 1234;
		emp2.isPermanent = false;
		
		System.out.println("Emp1 details: " + emp1.name + " " + emp1.age + " " + emp1.role + " " + emp1.empID + " " + emp1.isPermanent);
		System.out.println("Emp2 details: " + emp2.name + " " + emp2.age + " " + emp2.role + " " + emp2.empID + " " + emp2.isPermanent);
		
		EmployeeDetails emp3 = new EmployeeDetails();
		
		emp3.name = "Swathi";
		emp3.age = 30;
		//emp3.role is not defined, so it will take default value of String which is null
		//emp3.empId is not defined, so it will take default value of Integer which is 0
		//emp3.isPermanent is not defined, so it will take default value of boolean which is false
		System.out.println("Emp3 details: " + emp3.name + " " + emp3.age + " " + emp3.role + " " + emp3.empID + " " + emp3.isPermanent);
		
		//Create object without reference variable
		new EmployeeDetails();  //creates an object but there is no name for that object, so Garbage Collector will destroy these kind of objects
		
		System.gc(); // Calling Garbage Collector externally to recycle unused objects
		
		
		//null object reference
		
		EmployeeDetails emp4 = new EmployeeDetails();
		emp4 = null;  //emp4 is pointing to null not EmployeeDetails object, null reference
		
		//emp4.name = "Tom";  //Null Pointer Exception, it allow you to write i.e compile time
		//System.out.println(emp4.name); 
		emp4 = new EmployeeDetails();
		emp4.name = "Tom";  
				System.out.println(emp4.name);
		
		
		
		
		
		
		
		
		
		
	}

}
