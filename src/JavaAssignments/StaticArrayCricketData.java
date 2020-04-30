package JavaAssignments;

public class StaticArrayCricketData {

	public static void main(String[] args) {
		
		String name[] = new String[3];
		name[0] = "Rahul";
		name[1] = "Sachin";
		name[2] = "Mithali";
		
		int age[] = new int[3];
		age[0] = 40;
		age[1] = 38;
		age[2] = 28;
		
		char gender[] = new char[3];
		gender[0] = 'M';
		gender[1] = 'M';
		gender[2] = 'F';
		
		float strikeRate[] = new float[3];
		strikeRate[0] = 5.4f;
		strikeRate[1] = 4.4f;
		strikeRate[2] = 6.49f;
		
		//String teamName[] = new String[3]{"India","IPL","Womens"};
		String teamName[] = {"India","IPL","Womens"};	
		
		for(int i=0; i<3; i++)
			System.out.println("Name: "+name[i]+" Age: "+age[i]+" Gender: "+gender[i]+" strikeRate: "+strikeRate[i]+" Team Nmae: "+teamName[i]);
			
		
		
		
		
		
		
		
		

	}

}
