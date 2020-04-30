package JavaAssignments;

public class ObjectArrayCricketData {

	public static void main(String[] args) {
		Object PlayerOne[] = new Object[5]; // Object Array, can store different types of data but size is limited
		PlayerOne[0] = "Kaki";
		PlayerOne[1] = 24;
		PlayerOne[2] = 'F';
		PlayerOne[3] = 7.98f;
		PlayerOne[4] = "India";
		
		Object PlayerTwo[] = new Object[5]; 
		PlayerTwo[0] = "Bireddy";
		PlayerTwo[1] = 30;
		PlayerTwo[2] = 'M';
		PlayerTwo[3] = 8.54f;
		PlayerTwo[4] = "IPL";
		
		Object PlayerThree[] = new Object[5]; 
		PlayerThree[0] = "Nidhi";
		PlayerThree[1] = 18;
		PlayerThree[2] = 'F';
		PlayerThree[3] = 8.59f;
		PlayerThree[4] = "Under19";
				
		for(int i=0; i<PlayerOne.length; i++)
			System.out.print(PlayerOne[i]+" ");
		System.out.println();
		
		for(int j=0; j<PlayerTwo.length; j++)
			System.out.print(PlayerTwo[j]+" ");
		System.out.println();
		
		for(int k=0; k<PlayerThree.length; k++)
			System.out.print(PlayerThree[k]+" ");
		System.out.println();
		
			
		
		

	}

}
