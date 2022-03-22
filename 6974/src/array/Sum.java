package array;

import java.util.Scanner;

public class Sum 
{

	public static void main(String[] args) 
	{
	int a[][]=new int [2][2];
	int b[][]=new int [2][2];
	int c[][]=new int [2][2];
	int d[][]=new int [2][2];
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first matrix data ");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
          {
	         a[i][j]=sc.nextInt();
	        
          }
		  
	}
	System.out.print("Enter second matrix data ");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
          {
	         b[i][j]=sc.nextInt();
	
          }
		  
	}
	System.out.print("First Matrix \n");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
          {
	         System.out.print(a[i][j]+" \t");
          }
		System.out.println("\n");
	}
	System.out.print("Second Matrix \n ");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
          {
	         System.out.print(b[i][j]+"\t ");
          }
		System.out.println("\n");
		 
	}
	System.out.print("Sum of two Matrix \n");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
          {
	         c[i][j]=a[i][j]+b[i][j];
	         System.out.print(c[i][j]+"\t ");
          }
		System.out.println("\n");
	}
	System.out.print("Multiplication of two Matrix \n");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
          {
	         d[i][j]=a[i][j]*b[i][j];
	         System.out.print(d[i][j]+"\t ");
          }
		System.out.println("\n");
	}
	}

}
