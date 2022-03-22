package accessmodifiers;
class A
{
   int a,b; 
   void input()
	{
		a=52;
		b=65;
	}
    void output()
	{
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
}

public class Private 
{

	public static void main(String[] args) 
	{
	   A c=new A();
	   c.input();
	   c.output();
		
	}


	}


