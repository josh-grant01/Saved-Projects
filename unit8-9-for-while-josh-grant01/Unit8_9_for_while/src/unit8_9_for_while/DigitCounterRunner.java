package unit8_9_for_while;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Josh Grant

import static java.lang.System.*;

public class DigitCounterRunner
{
	public static void main( String args[] )
	{
		//add test cases
            out.println("234 contains " + DigitCounter.countDigits(234) + " digits\n");
            out.println("10000 contains " + DigitCounter.countDigits(10000) + " digits\n");
            out.println("111 contains " + DigitCounter.countDigits(111) + " digits\n");
            out.println("9005 contains " + DigitCounter.countDigits(9005) + " digits\n");
            out.println("84645 contains " + DigitCounter.countDigits(84645) + " digits\n");
            out.println("8547 contains " + DigitCounter.countDigits(8547) + " digits\n");
            out.println("123456789 contains " + DigitCounter.countDigits(123456789) + " digits\n");
	}
}