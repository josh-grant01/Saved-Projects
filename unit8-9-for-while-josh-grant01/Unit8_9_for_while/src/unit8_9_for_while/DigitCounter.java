package unit8_9_for_while;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Josh Grant

import static java.lang.System.*;

public class DigitCounter
{
   public static int countDigits( int number )
	{
		int sum = number, count = 0;
                while(sum > 0)
                {
                    /*out.println(sum % 10);
                    sum = sum /10;*/
                    int digit = sum % 10;
                    sum = sum / 10;
                    count++;
                }
		return count; 
	}
}