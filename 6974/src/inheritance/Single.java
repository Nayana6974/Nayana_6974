package inheritance;
class Sem1
{
	private int ae,cs,na;
	public void input()
	{
		ae=56;
		cs=84;
		na=79;
	}
	public void output()
	{
		System.out.println("----------Semester 1-----------");
		System.out.println("Marks of analog electronics is "+ae);
		System.out.println("Marks of control systems is "+cs);
		System.out.println("Marks of network analysis is "+na);
		int total=ae+cs+na;
		System.out.println("Total marks is "+total);
		System.out.println("==========================================");
} 
}
class Sem2 extends Sem1
{
	private int c,cpp,java;
	public void input1()
	{
		c=67;
		cpp=83;
		java=88;
	}
	public void output1()
	{
		System.out.println("----------Semester 2-----------");
		System.out.println("Marks of c language is "+c);
		System.out.println("Marks of cpp is "+cpp);
		System.out.println("Marks of java is "+java);
		int total=c+cpp+java;
		System.out.println("Total marks is "+total);
}
}

public class Single
{

	public static void main(String[] args) 
	{
		Sem2 obj=new Sem2();
		obj.input();
		obj.input1();
		obj.output();
		obj.output1();
		

	}

}

