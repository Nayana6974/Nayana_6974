package array;

import java.util.Scanner;

public class Reverse 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter how many elements you want");
	int n=sc.nextInt();
	int[] element=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the array elements "+(i+1));
		element[i]=sc.nextInt();
	}
	System.out.println("Original elements are:");
	for(int i=0;i<n;i++)
	{
		System.out.print(element[i]+ " ");
	}
	System.out.println("\n Reversed elements are:");
	for(int i=n-1;i>=0;i--)
	{
		System.out.print(element[i]+ " ");
	}

	}

}
