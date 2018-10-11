package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
                
                out.print("Enter a whole number :: ");
                int num = keyboard.nextInt();
                out.println(num + " is odd :: " + NumberVerify.isOdd(num));
                out.println(num + " is even :: " + NumberVerify.isEven(num) + "\n");
		
		//add in more test cases
                out.print("Enter a whole number :: ");
                num = keyboard.nextInt();
                out.println(num + " is odd :: " + NumberVerify.isOdd(num));
                out.println(num + " is even :: " + NumberVerify.isEven(num) + "\n");
		
                out.print("Enter a whole number :: ");
                num = keyboard.nextInt();
                out.println(num + " is odd :: " + NumberVerify.isOdd(num));
                out.println(num + " is even :: " + NumberVerify.isEven(num) + "\n");
		
                out.print("Enter a whole number :: ");
                num = keyboard.nextInt();
                out.println(num + " is odd :: " + NumberVerify.isOdd(num));
                out.println(num + " is even :: " + NumberVerify.isEven(num) + "\n");
		
                out.print("Enter a whole number :: ");
                num = keyboard.nextInt();
                out.println(num + " is odd :: " + NumberVerify.isOdd(num));
                out.println(num + " is even :: " + NumberVerify.isEven(num) + "\n");
		
                
	}
}