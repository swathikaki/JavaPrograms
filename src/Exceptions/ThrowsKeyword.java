package Exceptions;

public class ThrowsKeyword {

	
	
	
	public static void main(String[] args){
		
		ThrowsKeyword obj = new ThrowsKeyword();
		try{
		obj.launchBrowser();
		}catch(Exception e){
			System.out.println("Exception"+e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void launchBrowser() throws Exception{
		System.out.println("LB");
		checkVersion();
	}
	
	public void checkVersion() throws Exception{
		System.out.println("CV");
		checkPlugin();
	}

	public void checkPlugin()throws Exception{
		System.out.println("CP");
		int i = 9/3;
		ThrowsKeyword o1 = null;
		o1.checkPlugin();  //Nullpointer exception
		
	}

}
