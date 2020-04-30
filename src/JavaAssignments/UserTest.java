package JavaAssignments;

import JavaSessions.User;

public class UserTest {

	
	
	public static void main(String[] args) {
		
		
		User u1 = new User();
		
		u1.setName("Swathi");  //Accessing Private data from different class i.e Encapsulation
		System.out.println("Name is: "+u1.getName()); //Accessing Private data from different class i.e Encapsulation
		
		u1.setAge(25);
		System.out.println("Age is: "+u1.getAge());
		
		u1.setPhone(678567456);
		System.out.println("Phone Number is: "+u1.getPhone());

	}

}
