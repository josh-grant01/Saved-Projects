package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Grant
//Date - 2-13-18
//Class - Programing 6
//Lab  - Discount

import java.io.PrintStream;
import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
            if(bill <= 2000)
            {
                //No discount
                return bill;
            }
            else
            if(bill > 2000)
            {
                bill = bill - (bill * 0.15);
                return bill;
            }
            return 0;
	}
}