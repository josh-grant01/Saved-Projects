package unit8_9_for_while;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Josh Grant

import static java.lang.System.*; 

public class DigitAdder
{
   public static int sumDigits( int number )
	{
		int sum = number, total = 0;
                while(sum > 0)
                {
                    int digit = sum % 10;
                    sum = sum / 10;
                    total = total + digit;
                }
		return total;
	}
}