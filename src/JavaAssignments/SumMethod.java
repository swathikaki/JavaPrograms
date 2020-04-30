package JavaAssignments;

public class SumMethod {

	public int sumOfVariables(int var1, int var2){
		
		return var1+var2;
	}
	
   public int productOfVariables(int v1, int v2){
		
		return v1*v2;
	}
   
   public int areaOfCircle(int radius){
		
		int area = radius;
	   
	   return area;
	}
	
	
	
	public static void main(String[] args) {
		
		SumMethod obj = new SumMethod();
		int sum = obj.sumOfVariables(20, 35);
		System.out.println("Sum is: "+sum);
		
		int prod = obj.productOfVariables(20, 2);
		System.out.println("Product is: "+prod);
		
		

	}

}
