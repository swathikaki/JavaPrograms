package OOAbstract;

public class LoginPage extends Page {
	
	public LoginPage(){  //when we create child class object, parent class constructor will be called
		System.out.println("LogInPage class DEfault constructor");
	}
	
	public void header(){
		System.out.println("Login Page class header method");
	}
	
	public void title(){
		System.out.println("Login Page class title method");
	}

}
