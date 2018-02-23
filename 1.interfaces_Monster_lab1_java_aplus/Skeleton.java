//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2-14-17
//Class - 3rd
//Lab  - Skeleton

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	String name = "";
	int size = 0;
	//add instance variables
	
	//add a constructor
	
	public Skeleton(String n, int s)
	{
		setName(n);
		setSize(s);
		
	}
	
	public void setSize(int s)
	{
		size = s;
		
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getHowBig()
	{
		return size;
	}
	
	public String getName()
	{
		return name;
		

	}
	//add code to implement the Monster interface
	
	public boolean isBigger(Monster j)
	{
		boolean output = true;
		if(size>j.getHowBig())
		{
			output = true;
			
		}
		else
		{
			output = false;
		}
	return output;
	}
	public boolean isSmaller(Monster j)
	{
		boolean output = true;
		if(size<j.getHowBig())
		{
			output = true;
			
		}
		else
		{
			output = false;
		}
	return output;
		
	}
	
	public boolean namesTheSame(Monster j)
	{
		boolean output = true;
		if(name.equals(j.getName()))
		{
			output = true;
		}
		else
		{
			output = false;
		}
	return output;
	}
	//add a toString
	public String toString()
	{ return name + " " + size;
	}




}