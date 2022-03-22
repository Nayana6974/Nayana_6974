package inheritance;
class Aa
{
	void show_A()
	{
		System.out.println("Super class A");
	
	}
}
class Ba extends Aa
{
	void show_B()
	{
		System.out.println("B is sub class of A");
	}
}
class Ca extends Aa
{
	void show_C()
	{
		System.out.println("C is sub class of A");
	}
}
class Da extends Aa
{
	void show_D()
	{
	System.out.println("D is sub class of A");
}
}
public class Hierarchical {

	public static void main(String[] args)
	{
		Ba obj1=new Ba();
		Ca obj2=new Ca();
		Da obj3=new Da();
		
		obj1.show_A();
		obj1.show_B();
		
		obj2.show_A();
		obj2.show_C();
		
		obj3.show_A();
		obj3.show_D();
		
		
		
		
	}

}
