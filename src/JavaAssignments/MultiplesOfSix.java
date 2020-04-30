package JavaAssignments;

public class MultiplesOfSix {

	public static void main(String[] args) {
		//While loop
		System.out.println("using while loop");
		int i=1;
		while(i<=10)
		{
			System.out.println(i*6);
			i++;
		}
				
		  //Do While loop
		System.out.println("using Do while loop");
		int j=1;
		do
		{
			System.out.println(j*6);
			j++;
		}while(j<=10);
		
		
		System.out.println("using for loop");
		//For loop
		for(int k=10; k>=1; k--)
			System.out.println(k*6);	
			
	}

}
