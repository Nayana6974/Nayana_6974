package array;

public class Palindrome 
{
   public static void main(String[] args)
	{
		int num=121;
		int temp=num;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;  //1 ,2, 1
			rev=rev*10+rem;   //1 ,12, 121
			temp=temp/10;   //12 ,1,  0
		}
		if(num==rev)
		{
			System.out.println(num+" is a palindrome number");
		}
		else
		{
			System.out.println(num+"is not a palindrome number ");
		}

	}

}
