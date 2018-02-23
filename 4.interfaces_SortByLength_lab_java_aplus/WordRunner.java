//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2-14-17
//Class - 3rd
//Lab  - WordRunner


import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		int size = file.nextInt();
		file.nextLine();
		
		Word loooooooooooooooooooooooooooool[] = new Word[size];
		
		for(int j = 0; j < size; j++)
		{
			Word t = new Word(file.next());
			loooooooooooooooooooooooooooool[j] = t;
		}
		
		for(int j= 0; j < size; j++)
		{
			for(int t = 0; t < size - 1; t++)
			{
				if(loooooooooooooooooooooooooooool[t].compareTo(loooooooooooooooooooooooooooool[t + 1]) > 0)
				{
					Word r=loooooooooooooooooooooooooooool[t + 1];
					loooooooooooooooooooooooooooool[t + 1]=loooooooooooooooooooooooooooool[t];
					loooooooooooooooooooooooooooool[t]=r;
				}
				else if(loooooooooooooooooooooooooooool[t].getLength()==loooooooooooooooooooooooooooool[t + 1].getLength()&&loooooooooooooooooooooooooooool[t].toString().compareTo(loooooooooooooooooooooooooooool[t + 1].toString()) > 0)
				{
					Word r = loooooooooooooooooooooooooooool[t + 1];
					loooooooooooooooooooooooooooool[t + 1] = loooooooooooooooooooooooooooool[t];
					loooooooooooooooooooooooooooool[t] = r;
				}
			}
		}
		
		for(int j = 0; j < size; j++)
		{
			System.out.println(loooooooooooooooooooooooooooool[j]);
		}

	}
}