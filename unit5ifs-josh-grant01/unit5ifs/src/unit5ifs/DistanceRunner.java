package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Grant
//Date - 2-16-18
//Class - Programming 6
//Lab  - Distance Formula

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
            int count = 1;
            while(count <= 4)
            {
                Scanner keyboard = new Scanner( System.in );

		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
                out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println("\n" + test.determineClosest() + "\n\n\n");
		count += 1;
		//add more test cases
            }
	}
}