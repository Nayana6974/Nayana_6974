package array;

import java.util.Scanner;

public class ArrayScanner
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students ");
        int n=sc.nextInt();
        int marks[]=new int[n];
        
        System.out.println("Enetr the marks   ");
        for(int i=0;i<marks.length;i++)
        {
        	 marks[i] =  sc.nextInt();
        }
        
        
        System.out.println("Elements are   ");
        
        for(int a:marks)
        {
        	 System.out.println("element are" +a);
        }
        
		
		
				
	}

}
