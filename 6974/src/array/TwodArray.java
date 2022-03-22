package array;

public class TwodArray
{

	public static void main(String[] args)
	{
		int marks[][]=new int[2][3];
		marks[0][0]=12;
		marks[0][1]=15;
		marks[0][2]=25;
		marks[1][0]=26;
		marks[1][1]=34;
		marks[1][2]=46;
		for(int row=0;row<marks.length;row++)
		{
			  for(int col=0;col<marks[row].length;col++)
			  {
				  System.out.print(+marks[row][col]+"\t");
			  }
			  System.out.println("\n");
		}
				

	}

}
