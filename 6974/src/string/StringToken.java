package string;

import java.util.StringTokenizer;

public class StringToken 
{

	public static void main(String[] args) 
	{
	   System.out.println("------Constructor 1-------");
	   StringTokenizer st1=new StringTokenizer("Hello Geeks How are you"," ");
	   while(st1.hasMoreTokens())
	   {
		   System.out.println(st1.nextToken());
	   }
	   System.out.println("------Costructor 2--------");
	   StringTokenizer st2=new StringTokenizer("JAVA : Code : String",":");
	   while(st2.hasMoreTokens())
	   {
		   System.out.println(st2.nextToken());
	   }
	   System.out.println("-----Constructor 3------");
	   StringTokenizer st3=new StringTokenizer("JAVA: code : String",":",true);
	   while(st3.hasMoreTokens())
	   {
		   System.out.println(st3.nextToken());
	   }

	}

}
