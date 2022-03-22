package Selection;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) 
	{
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks=in.nextInt();
		if(marks>=35)
		{
			System.out.println("You are pass.");
		}
		else
		{
			System.out.println("You are fail.");
		}
		// TODO Auto-generated method stub

	}

}
