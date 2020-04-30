package OOAbstract;

public class TestPage {

	public static void main(String[] args) {
		
		
		LoginPage lp = new LoginPage();  //Parent class constructor will be called first then child class const
		lp.title();
		lp.search();
		lp.title();
		
		//HomePage hp = new HomePage();
		
		Page p = new LoginPage();
		p.search();
		p.header();
		p.title();
		
		
	}

}
