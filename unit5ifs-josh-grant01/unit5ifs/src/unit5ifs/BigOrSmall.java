package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joshua Grant

import static java.lang.System.*; 
import java.util.Scanner;

public class BigOrSmall
{
	public static String check( int a, int b )
	{
            if(a > b)
            {
                return "yes";
            }
            if(a <= b)
            {
                if(a < b)
                {
                    return "no";
                }
                else
                if(a == b)
                {
                    return "aplus";
                }
            }
            return "";
	}
}