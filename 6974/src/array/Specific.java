package array;

public class Specific
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int find=10;
		boolean check=false;
		for(int element=0;element<arr.length;element++)
		{
			if(element==find)
		     {
				check=true;
				break;
			 }
		}
if(check)
{
	System.out.println(find+ " is found ");
}
else
{
	System.out.println(find+ " is not found ");
}
	}
}
