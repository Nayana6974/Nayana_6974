package polymorphism;

public class MethodOverloading
{
	public void area(int side)
	{
		System.out.println("Side of square is  "+side);
		int result=side*side;
		System.out.println("Area of square is "+result);
		System.out.println("--------------------------------");
	       	
	}
	
   public void area(int length,int breadth)
   {
		System.out.println("Length of the rectangle is "+length);
		System.out.println("Breadth of the rectangle is "+breadth);
		int area=length*breadth;
		System.out.println("Area of rectangle is "+area);
		System.out.println("------------------------------------");
	}
   public void area(double pi,int r)
   {
	   System.out.println("Radiusof circle is "+r);
	   double area=pi*r*r;
	   System.out.println("Area of circle is "+area);
   }
	public static void main(String[] args)
	{
		MethodOverloading obj=new MethodOverloading();
		obj.area(8);
		obj.area(12,8);
		obj.area(3.14,8);

	}

}
