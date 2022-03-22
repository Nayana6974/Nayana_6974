package array;

public class Marks
{
	public void display(int marks[])
	{
		for(int c:marks)     //enhanced loop
		{
			System.out.println(c);
		}
	}
	public int[] process()
	{
	int score[]= {4,5,6,7};
	return score;
	}

	public static void main(String[] args)
	{
		int math[]=new int[7];
		math[0]=35;
		math[1]=46;
		math[2]=38;
		math[3]=27;
		math[4]=49;
		math[5]=40;
		math[6]=29;
		for(int i=0;i<math.length;i++)
		{
			System.out.println("Marks in Mathematics of student "+i+" is "+math[i]);
		}
		int english[]=new int[] {44,56,78,86,49};
		for(int i=0;i<english.length;i++)
		{
			System.out.println("Marks in english of stdent "+i+" is "+english[i]);
		}
		int marks[]= {34,37,28,45,19};
		Marks obj=new Marks();
		obj.display(marks);
		int arr[]=obj.process();
		for(int s:arr) 
		{
			System.out.println(s);
		}
		
		
	}

}
