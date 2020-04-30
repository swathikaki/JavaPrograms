package WbDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //Top Casting, accessing parent class method with child class obj
		
		driver.get("http://www.google.com");
		driver.findElement("username");
		driver.findElement("password");
		
		
		System.out.println(driver.getTitle());

	}

}
