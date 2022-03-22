package array;

public class Copy
{

	public static void main(String[] args) 
	{
		int[] original= {89,10,45,66,30};
		int[] copy=original;
		System.out.println("Original Array is: ");
		for(int i=0;i<original.length;i++)
		{
			System.out.print(original[i]+"\t");
		}
		System.out.println("\n");
		System.out.println("Copied array is: ");
		for(int i=0;i<copy.length;i++)
		{
			System.out.print(original[i]+"\t");
		}
	}

}
