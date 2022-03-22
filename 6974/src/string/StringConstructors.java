package string;

public class StringConstructors
{

	public static void main(String[] args)
	{
	  char chars[]= {'H','e','l','l','o'};
	  String s=new String(chars);
	  System.out.println("String is : "+s);
	  System.out.println("================================");
	  
	  //Sub range of character array
	  char sub[]= {'H','e','l','l','o','J','a','v','a','!'};
	  String s2=new String(sub,5,4);
	  System.out.println("String is : "+s2);
	  System.out.println("================================");
	  
	  //we can construct object that contains same char sequence as another string object 
	  char arr[]= {'H','e','l','l','o','W','o','r','l','d'};
	  String s1=new String(arr);
	  System.out.println("String is: "+s1);
	  String s3=new String(s1);
	  System.out.println("String is: "+s3);
	  System.out.println("================================");
	  
	  //String class also provides constructors that initialize a string when given a byte array
	   byte ascChars[]= {65,66,67,68,69,70};
	   String s4=new String(ascChars);
	   System.out.println("String is : "+s4);
	   String s5=new String(ascChars,2,3);
	   System.out.println("String is : "+s5);
	}

}
