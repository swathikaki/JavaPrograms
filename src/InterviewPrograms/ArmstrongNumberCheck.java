package InterviewPrograms;

import java.util.Scanner;

public class ArmstrongNumberCheck {
	
	private static boolean isItArmstrongNumber(int inputNumber)
    {
        int copyOfInputNumber = inputNumber;
         
        int sum = 0;
         
        while (inputNumber > 0)
        {
            int lastDigit = inputNumber % 10;
             
            sum = sum + (int) Math.pow(lastDigit, 3);
             
            inputNumber = inputNumber / 10;
             
          }
         
        if (sum == copyOfInputNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    public static void main(String[] args) 
    {
        //ArmStrong number is 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
    	Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter a number :");
         
        int inputNumber = sc.nextInt();
              
        if (isItArmstrongNumber(inputNumber))
        {
            System.out.println(inputNumber+" is a Armstrong number");
        }
        else
        {
            System.out.println(inputNumber+" is not a Armstrong number");
        }
         
        sc.close();
    }
	
	

}
