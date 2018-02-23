//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor
//Date - 2-14-17
//Class - 3rd
//Lab  - RomanNumeral

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private int number;
	private String roman;
	
	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};
	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
											  "L","XL","X","IX","V","IV","I"};
	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(int orig)
	{
		setNumber(orig);
	}

	public void setNumber(int orig) 
	{
		number = orig;
		String st = "";
		for(int j = 0; j < NUMBERS.length; j++) 
		{
			while(orig >= NUMBERS[j])
			{
				st+=LETTERS[j];
				orig -= NUMBERS[j];
			}
		}
		roman = st;
	}
	
	public void setRoman(String str) 
	{
		roman = str;
		int r = 0;
		while(!str.equals("")) 
		{
			boolean finder = false;
			if(str.length()>=2)
			 {
				String one = str.substring(0,2);
				for(int j = 0; j < LETTERS.length; j++)
				{
					if(one.equals(LETTERS[j])) 
					{
						r+=NUMBERS[j];
						str = str.substring(2);
						finder = true;
					}
				}
			}
			if(!finder) 
			{
				String preston = str.substring(0,1);
				for(int j = 0; j < LETTERS.length; j++)
				 {
					if(preston.equals(LETTERS[j])) 
					{
						r+=NUMBERS[j];
						str = str.substring(1);
						break;
						
					}
				}
			}	
		}
		number = r;
	}

	public int getNumber() 
	{
		return number;
	}
	
	public String getRoman() 
	{
		return roman;
	}
	

	public int compareTo(RomanNumeral r)
	{
		return number - r.getNumber();
	}
	
	public boolean equals(RomanNumeral r) 
	{
		return number == r.getNumber();
	}

	public String toString() 
	{
		return roman;
	}
}