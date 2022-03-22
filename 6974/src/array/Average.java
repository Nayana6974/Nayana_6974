package array;

import java.util.Scanner;

public class Average 
{

	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter how many elements you want");
	    int n=sc.nextInt();
	    int[]arr=new int[n];
	    System.out.println("Enter "+n+" elements in an array:");
	    int sum=0;
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    	sum+=arr[i];
	    }
	    System.out.println("Average is:"+sum/n);
	    
	}

}
