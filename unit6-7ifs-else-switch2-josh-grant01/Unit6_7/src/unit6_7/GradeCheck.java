package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 421/18
//Class - Programming 6
//Lab  - Grade Check

import static java.lang.System.*; 
import java.util.Scanner;

public class GradeCheck
{
	public static void main( String args[] )
	{
            //add test cases
            
            Scanner keyboard = new Scanner(System.in);
            
            int count = 1;
            while(count <= 8)
            {
            out.print("Enter a number grade :: ");
            int x = keyboard.nextInt();
            
            Grade test = new Grade(x);
            out.println(test);
            
            count ++;
            }
	}
}