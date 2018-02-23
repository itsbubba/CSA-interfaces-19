//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2-14-17
//Class - 3rd
//Lab  - Monster

import static java.lang.System.*; 

public interface Monster
{
	public void setName(String n);
	public void setSize (int s);
	public int getHowBig();
	public String getName();
	public boolean isBigger(Monster other);	
	public boolean isSmaller(Monster other);
	public boolean namesTheSame(Monster other);
}