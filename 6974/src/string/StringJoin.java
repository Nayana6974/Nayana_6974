package string;

import java.util.StringJoiner;

public class StringJoin 
{

	public static void main(String[] args)
	{
	StringJoiner joinNames=new StringJoiner(",","#","#");
	joinNames.add(" kavana");
	joinNames.add("punarvi");
	joinNames.add("aadhya");
	joinNames.add("priyanka ");

	System.out.println(joinNames);
	}

}
