package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joshua Grant

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSub
{
    public static double check( int a, int b )
    {
        if(a > b)
        {
            return (a - b);
        }
        else
        if(a <= b)
        {
            if(a < b)
            {
                return (b - a);
            }
            else
            if(a == b)
            {
                return (a + b);
            }
        }
        return 0;
    }
}