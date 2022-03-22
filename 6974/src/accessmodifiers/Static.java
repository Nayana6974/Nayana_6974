package accessmodifiers;
class Student
{
	int rollno;
	String name;
	static String college="EPCET";
	Student(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class Static 
{

	public static void main(String[] args)
	{
		Student S1=new Student(55,"Navya");
		Student S2=new Student(56,"Nayana");
		S1.display();
		S2.display();

	}
	static
	{
		System.out.println("Hello world");
	}

}
