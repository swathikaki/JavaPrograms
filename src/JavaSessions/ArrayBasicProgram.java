package JavaSessions;

public class ArrayBasicProgram {

	public static void main(String[] args) {
		
		//Int Array
		int a[]= new int[4];
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
				
		System.out.println(a[1]);
		System.out.println(a[1]+a[2]);
		//System.out.println(a[4]);  ArrayIndexOutOfBound exception
		//System.out.println(a[-1]);  ArrayIndexOutOfBound exception
		
		System.out.println("Array Length: "+a.length); 
		System.out.println("Array Highest Index is: "+((a.length)-1)); 
		System.out.println("Array Lowest Index is: "+0);
		
		//To print entire Array
		for(int i=0; i<a.length;i++)
			System.out.println("Array values: "+a[i]); 
		
		int p[]= new int[5];
		 p[0]=100;
		 p[1]=200;
		 p[4]=400;
		 System.out.println(p[2]);  ///will give the default value of an integer as no value assigned
		 System.out.println(p[4]);
		 //System.out.println(p[5]); ArrayIndexOutOfBound
		 
		 //Default value of double is 0.0
		 
		 char c[]=new char[2];		 
		 double d[]=new double[6];
		 boolean b[]=new boolean[3];
		 String str[]=new String[4];
		 
		 //str[0]="Swathi";
		 str[1]="Yug";
		 str[2]="Nidhi";
		 str[3]="Nithya";
		// str[4]="happy"; // ArrayIndexOutOfBoundException as going beyond size of the Array
		 
		 for(int k=0; k<str.length;k++)
				System.out.println("String Array values: "+str[k]);
		 
		// System.out.println(str[5]) // Array Index OutOfBound Exception
		 
		 System.out.println(str[0]);  //No value is 0 index so default value of string will be printed
		 
		 
		 
		 
		 
		 
		 
		

	}

}
