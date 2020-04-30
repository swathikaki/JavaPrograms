package OOInterface;

public class TestHospital {

	public static void main(String[] args) {
		
		EmoryHospital EH = new EmoryHospital();
		
		EH.CardioServices();
		EH.ENTServices();
		EH.emergencyServices();
		EH.NineOneOneServices();
		EH.GynicServices();
		EH.OnchologyServices();
		EH.OPTServices();
		EH.orthoServices();
		
		EH.pandemicServices();
		EH.VirusVaccination();  //Parent class methods, Inheritance concept
		EH.polioServices(); //GrandParent method multi level inheritance
		EH.Population();  //GrandParent interface method
		EH.FDA();  //Default method
		
		IndianMedical.bloodBank();  //Static method can be accessed using Class name or Interface name
		
		USMedical us = new EmoryHospital();  //TOP Casting, Child class object can be referred by parent class reference var
		
		us.orthoServices();
		us.physioServices();
		us.NineOneOneServices();  //Only USMedical interface methods can be accessible, no child class methods
		//down casting is not even allowed at run time as well as in Compile time
		//As we can't create objects for interfaces
		
		IndianMedical in = new EmoryHospital(); 
		in.CardioServices();
		in.OPTServices();  //Only IndianMedical interface methods can be accessible
		
		

	}

}
