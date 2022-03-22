package string;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		// CharAt
		String x="Nayana";
		System.out.println(x.charAt(2));
		System.out.println("=========================");
		
		// concatenate
		String y="Hello";
		System.out.println(y.concat(" My friend!"));
		System.out.println("=========================");
		
		// length()
        String z="01584";
        System.out.println(z.length());
        System.out.println("=========================");
        
        // String replace
        String a="oxoxoxox";
        System.out.println(a.replace('x','X'));
        System.out.println("=========================");
        
        //String to lower case
        String b="A NEW MOON";
        System.out.println(b.toLowerCase());
        System.out.println("=========================");
        
        // string to upper case
        String c="a full moon";
        System.out.println(c.toUpperCase());
        System.out.println("=========================");
        
        //ends with(string suffix)
        String d="Football";
        System.out.println(d.endsWith("ball"));
        System.out.println("=========================");
        
        //starts with (string prefix)
        String e="Football";
        System.out.println(e.startsWith("Foot"));
        System.out.println("=========================");
        
        
        
	}

}
