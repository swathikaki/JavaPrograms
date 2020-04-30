package WbDriver;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver(){
		System.out.println("ChromeDriver Constructor Launching google chrome");
	}
	
	public void get(String url){
		System.out.println("ChromeDriver Launching URL: "+url);
	}
	
	public String getTitle(){
		System.out.println("ChromeDriver get Title");
		return "google";
	}

	public void findElement(String element){
		System.out.println("ChromeDriver ");	
	}

}
