package OOInterface;

public class EmoryHospital extends WHO implements USMedical, UKMedical, IndianMedical{
	
	@Override
	public void orthoServices(){
		System.out.println("Emory orthoServices");
	}
	
	@Override
	public void physioServices(){
		System.out.println("Emory physioServices");
	}
	
	@Override
	public void NineOneOneServices(){
		System.out.println("Emory NineOneOneServices");
		
	}
	
//	default void FDA(){
//		System.out.println("default method FDA from EmoryHospital");
//	}
	
	@Override
	public void emergencyServices(){
	System.out.println("Emory emergrncyServices");
	}
	
	public void Population(){
		System.out.println("GHC Population method");  //GrandParent interface method
	}


	@Override	
	public void OnchologyServices(){
		System.out.println("Emory OnchologyServices");
		}
	
	@Override
	public void OPTServices(){
		System.out.println("Emory OPTServices");
		}
	
	@Override
	public void CardioServices(){
		System.out.println("Emory CardioServices");
		}
	
	//Non Overridden methods
	public void ENTServices(){
		System.out.println("Emory ENTServices");
		}
	
	public void GynicServices(){
		System.out.println("Emory GynicServices");
		}

	
}
