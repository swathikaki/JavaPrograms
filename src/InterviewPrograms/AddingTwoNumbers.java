package InterviewPrograms;

public class AddingTwoNumbers {
	
	static int add(int a, int b)
	{
		int sum = 0;
		int carry = 0;
		
		if(b==0)
			return a;
		sum = a^b;
		carry = (a&b)<<1;
		return add(sum, carry);
			
	}

	public static void main(String[] args) {
		
		int a=7; 
		int b=5;
		
		//technique 1
		int sum = 0;
//		while(b>0){
//		sum = a&b;
//		a = a^b;
//		b = sum<<1;
//		}
//		sum =a;
		
		//technique 2
//		while(b > 0){
//			a++;
//			b--;
//		}
//		sum =a;
//		System.out.println(" sum is: " + sum);
//		
		//By using recursive method
		System.out.println("Sum is: " + add(a,b));
		
		
		
		
	}

}
