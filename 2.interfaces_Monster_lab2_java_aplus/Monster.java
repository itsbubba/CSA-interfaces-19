//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2-14-17
//Class - 3rd
//Lab  - Monster

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	public Monster()
	{
	}

	public Monster(int ht)
	{
		setHeight(ht);
		
	}

	public Monster(int ht, int wt)
	{
		setHeight(ht);
		setWeight(wt);
		
	}

	public Monster(int ht, int wt, int age)
	{
		setHeight(ht);
		setWeight(wt);
		setAge(age);
			
	}

	public void setHeight(int ht)
	{
		myHeight=ht;
		
	}
	
	public void setWeight(int wt)
	{
		myWeight=wt;
		
	}
	
	public void setAge(int age)
	{
		myAge= age;
		
	}
	
	public int getHeight()
	{
		return myHeight;
		
	}
	
	public int getWeight()
	{
		return myWeight;
		
	}
	
	public int getAge()
	{
		return myAge;
		
	}
	
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals(Object obj)
	{
		Monster boop = (Monster)obj;
		boolean output = false;
		if(myHeight==boop.getHeight()&&myWeight==boop.getWeight()&&myAge==boop.getAge())
		{
			output = true;	
		}
		return output;
	}

	public int compareTo(Object obj)
	{
		int output = 0;
		Monster boop = (Monster)obj;
		
		if(myHeight > boop.getHeight())
		{
			output = 1;
		}
		else if(myHeight < boop.getHeight())
			{
			output = -1;
			}	
			else
			{
			if(myWeight > boop.getWeight())
				{
				output = 1;
				}
				else if(myWeight < boop.getWeight())
				{
				output = -1;
				}
				else
				{
				if(myHeight > boop.getHeight())
				{
					output = 1;
				}
				else if(myHeight < boop.getHeight())
				{
					output = -1;
				}else
				{
				}
			}
		}

		return output;
	}

	public String toString()
	{
		return Integer.toString(myHeight) + " " + Integer.toString(myWeight) + " " + Integer.toString(myAge);
	}	
}