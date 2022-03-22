package array;

public class Prime {

	public static void main(String[] args) 
	{
	   for(int num=2;num<=20;num++)
	   {
		   int n=0;
		   for(int i=2;i<=num-1;i++)
		   {
			 if(num%i==0)
			 {
				 n=n+1;
			 }
		   }
		   if(n==0)
		   {
			   System.out.println(num);
		   }
	   }
	

	}

}
