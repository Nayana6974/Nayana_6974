package modifiers;

public class Access1 
{
int x,y;
public void input()
{
	x=5;
	y=9;
}
public void output()
{
	int sum = x+y;
	System.out.println("sum of x and y is " +sum);
}
	public static void main(String[] args)
	{
	Access1 access= new Access1();
	access.input();
	access.output();

	}

}
