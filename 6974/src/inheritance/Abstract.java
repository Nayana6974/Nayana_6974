package inheritance;
abstract class Bike
{
	abstract void run();
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
}

public class Abstract
{

	public static void main(String[] args)
	{
		Honda obj=new Honda();
		obj.run();

	}

}
