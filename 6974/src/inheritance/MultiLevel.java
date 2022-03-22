package inheritance;
class Sem3
{
	public Sem3()
	{
		System.out.println("---Sem3 constructor----");
	}
	private int be,fon;
	public void input1()
	{
		be=89;
		fon=70;
	}
	public void output1()
	{
		System.out.println("---------Semester 3----------");
		System.out.println("Marks in Basic electronics is "+be);
		System.out.println("Marks in Fibre optics is "+fon);
		int total=be+fon;
		System.out.println("Total marks is "+total);
		System.out.println("======================================");
	}
}
class Sem4 extends Sem3
{
	public Sem4()
	{
		System.out.println("---Sem4 constructor---");
	}
	private int ds,se;
	public void input2()
	{
		ds=90;
		se=79;
	}
	public void output2()
	{
		System.out.println("---------Semester 4----------");
		System.out.println("Marks in Data structures is "+ds);
		System.out.println("Marks in Software engineer is "+se);
		int total=ds+se;
		System.out.println("Total marks is "+total);
		System.out.println("======================================");
	}	
}
class Sem5 extends Sem4
{
	public Sem5()
	{
		System.out.println("---Sem5 constructor---");
	}
	private int cpp,java;
	public void input3()
	{
		cpp=69;
		java=89;
	}
	public void output3()
	{
		System.out.println("---------Semester 5----------");
		System.out.println("Marks in cpp is "+cpp);
		System.out.println("Marks in java is "+java);
		int total=cpp+java;
		System.out.println("Total marks is "+total);
		
	}	
	
}
public class MultiLevel
{

	public static void main(String[] args)
	{
		Sem5 obj=new Sem5();
		obj.input1();
		obj.input2();
		obj.input3();
		obj.output1();
		obj.output2();
		obj.output3();
	}

}
