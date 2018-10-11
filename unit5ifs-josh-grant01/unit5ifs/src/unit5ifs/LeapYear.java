package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Grant
//Date - 2-14-18
//Lab  - Unit 5 Ifs

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	public static boolean isLeapYear( int year )
	{
            if(year % 4 == 0)
            {
                if(year % 100 == 0)
                {
                    if(year % 400 == 0)
                    {
                        return true;
                    }
                    
                    else
                    {
                        return false;
                    }
                }
                
                else
                {
                    return true;
                }
            }
            
            else
            {
                return false;
            }
	}
}
