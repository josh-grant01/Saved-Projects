package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Grant
//Date - 2-24-18
//Class - Programming 6
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
    public static void main ( String[] args )
    {
        int count = 1;
        while(count <= 8)
        {
            Scanner keyboard = new Scanner(System.in);
            
            out.print("Enter a word :: ");
            String s = keyboard.next();
            
            StringOddOrEven word = new StringOddOrEven(s);
            word.setString(s);
            if(word.isEven())
            {
                out.println(s + " is even.\n");
            }
            else
            {
                out.println(s + " is odd.\n");
            }
            count += 1;
        }
    }
}