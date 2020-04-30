package JavaAssignments;

public class LoopsAssignmentNumWhile {

	public static void main(String[] args) {
		
		//While loop
		System.out.println("using while loop");
		int j=1;
		while(j<=10)
		{
			if(j%7==0)
			{
				//System.out.println("Number is divisible by 7");
				j++;
			}
			else
			{	
				System.out.println(j);
				j++;
			}
		}
	}

}
