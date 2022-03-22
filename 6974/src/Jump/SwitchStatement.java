package Jump;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any day of week from 0 to 6");
		int day=sc.nextInt();
		
		switch(day)
		{
		   case 0:
			         System.out.println("Today is sunday");
			         break;
		   case 1:
			         System.out.println("Today is monday");
			         break;
		   case 2: 
			         System.out.println("Today is tuesday");
			         break;
		   case 3:
			         System.out.println("Today is wednesday");
			         break;
		   case 4:
			         System.out.println("Today is thursday");
			         break;
		   case 5:
			         System.out.println("Today is friday");
			         break;
		   case 6:
			         System.out.println("Today is saturday");
			         break;
		   default:
			         System.out.println("Wrong input");
			      
			     
		}
		// TODO Auto-generated method stub

	}

}
