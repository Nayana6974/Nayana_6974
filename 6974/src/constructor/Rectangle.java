package constructor;

public class Rectangle 
{
	Rectangle(int length, int width)

	{
      System.out.println(" Length is "+length);
      System.out.println(" Width is "+width);
      int area= length*width;
      System.out.println("Area is "+area);
	}
	Rectangle(int a)
	{
		System.out.println("Value of A is " +a);
	}
	Rectangle()
	{
		System.out.println("hello world");
	}
	
	

	public static void main(String[] args)
	{
		Rectangle obj= new Rectangle(10,20);
		Rectangle obj1=new Rectangle(30);
		Rectangle obj2=new Rectangle();

	}

}
