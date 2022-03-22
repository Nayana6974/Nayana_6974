package Operators;

public class LogicalOperator {

	public static void main(String[] args) 
	{
		int a=60;
		int b=20;
		int c=30;
		int d=25;
		
		if(a>b && a>c && a>d)
		{
			  System.out.println(a+" is greatest");
		}
		
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		System.out.println("Value of c "+c);
		System.out.println("Value of d "+d);
		
		boolean result=(a<b)||(c>d);
		System.out.println(" (a<b)||(c>d)  "+result);
		
		// TODO Auto-generated method stub

	}

}
