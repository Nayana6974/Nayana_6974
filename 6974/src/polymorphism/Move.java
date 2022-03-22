package polymorphism;
class Cheetah
{
	int z;
	public Cheetah(int a)
	{
		System.out.println("This is class cheetah constructor");
		System.out.println("value of a is "+a);
	
	}
	public void animal()
	{
		System.out.println("Cheetah is fastest moving animal");
	}
}
class Tiger extends Cheetah
{
	public Tiger()
	{
		super(12);
		super.z=35;
		super.animal();
		System.out.println("value of z is " +z);
		System.out.println("This is class Tiger constructor");
	}
	public void animal()
	{
		
		System.out.println("National animal of india is tiger");
	}
}

public class Move
{

	public static void main(String[] args) 
	{
	   Tiger t=new Tiger();
	   t.animal();
	   

	}

}
