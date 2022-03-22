package inheritance;
interface Test1
{
  final static int a=10;
  abstract void area();
  abstract void volume();
}
interface Test2
{
	final static int b=20;
	abstract void area1();
}
class Result
{
	public void performance()
	{
		System.out.println("your performance in the test is good");
	}
}
public class MultipleInheritance extends Result implements Test1,Test2
{

	public static void main(String[] args)
	{
		MultipleInheritance obj=new MultipleInheritance();
		obj.area();
		obj.volume();
		obj.area1();
		
	}

	@Override
	public void area1() 
	{
		int area1= b*b;
		System.out.println("Area1 is "+area1);
		
	}

	@Override
	public void area() 
	{
		super.performance();
	    int area=a*a;
	    System.out.println("Area is "+area);
	}

	@Override
	public void volume() 
	{
		int c=15;
		int volume = a*a*c;
		System.out.println("volume is "+volume);
		
	}


}