package unit8_9_for_while;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Josh Grant

import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
            if(num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1)
            {
                return true;
            }
            return false;
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
            int count = 0;
            int num = 0;
            
            for(num = 6; num <= stop; num++)
            {
                if(isCoolNumber(num))
                {
                    count++;
                }
                //return count;
            }
            return count;
	}
}