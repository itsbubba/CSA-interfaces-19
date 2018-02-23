//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2-14-17
//Class - 3rd
//Lab  - MonsterRunner

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		//ask for name and size
		System.out.print("Enter 1st Monster's name :: ");
		String nameone = keyboard.next();
		System.out.print("Enter 1st Monster's size :: ");
		int sizeone = keyboard.nextInt();
		System.out.print("\n");
		//ask for name and size
		System.out.print("Enter 2nd Monster's name :: ");
		String nametwo = keyboard.next();
		System.out.print("Enter 2nd Monster's size :: ");
		int sizetwo = keyboard.nextInt();
		//instantiate monster one
		Skeleton monsterone = new Skeleton(nameone, sizeone);
		//instantiate monster two
		Skeleton monstertwo = new Skeleton(nametwo, sizetwo);
		System.out.print("\n");
		
		System.out.println(monsterone);
		System.out.println(monstertwo);
		System.out.print("\n");
		
		if(monsterone.isBigger(monstertwo))
		{
			System.out.println("Monster one is bigger than Monster two.");
		
		}
		else
		{
			System.out.println("Monster one is smaller than Monster two.");
			
		}
		if(monsterone.namesTheSame(monstertwo))
		{
			System.out.println("Monster one has the same name as Monster two.\n");
		}
		else
		{
			System.out.println("Monster one does not have the same name as Monster two.\n");
		}
		
	}
}