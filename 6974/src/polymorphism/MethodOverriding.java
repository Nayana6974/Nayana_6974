package polymorphism;
class Animal
{
	int x=28;
	public void walk()
	{
		System.out.println("Animals can walk");
	}
}
class Dog extends Animal
{
	int x=17;
	public void walk()
	{
		System.out.println("Dogs can walk and run");
	}
}

public class MethodOverriding 
{

	public static void main(String[] args) 
	{
		Animal d=new Dog();
		d.walk();
		System.out.println(d.x);

	}

}
