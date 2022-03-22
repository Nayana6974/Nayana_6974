package Selection;

import java.util.Scanner;

public class NestedIfStatement {

	public static void main(String[] args)
	{
	int a,b,c;
	int max=0;
	Scanner s=new Scanner(System.in);// TODO Auto-generated method stub
    System.out.println("Enter value of a:");
    a=s.nextInt();
    System.out.println("Enter value of b:");
    b=s.nextInt();
    System.out.println("Enter value of c:");
    c=s.nextInt();
    if(a>b)
    {
    	  if(a>c)
    		  max=a;
    	  else
    		  max=c;
    }
    else
    {
    	if(b>c)
    		max=b;
    	else
    		max=c;
    }
    System.out.println("\n max value=" +max);
	}

}
