package JavaSessions;

public class ObjectArrayPgm {

	public static void main(String[] args) {
		
		Object obj[] = new Object[5]; // Object Array, can store different types of data but size is limited
		obj[0]="Kaki";
		obj[1]=5;
		obj[2]=12.877;
		obj[3]='c';
		obj[4]=true;
		
		for(int i=0; i<obj.length; i++)
			System.out.println(obj[i]);
		

	}

}
