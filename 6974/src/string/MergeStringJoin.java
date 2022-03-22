package string;

import java.util.StringJoiner;

public class MergeStringJoin
{

	public static void main(String[] args)
	{
	    StringJoiner joinNames=new StringJoiner(",","[","]");
	    joinNames.add("Saniha");
	    joinNames.add("Ibbani");
	    
	    StringJoiner joinNames2=new StringJoiner(":","#","#");
	    joinNames2.add("Disha");
	    joinNames2.add("Deepthi");
	    
	    StringJoiner merge=joinNames.merge(joinNames2);
	    System.out.println(merge);
	    
	    
	    

	}

}
