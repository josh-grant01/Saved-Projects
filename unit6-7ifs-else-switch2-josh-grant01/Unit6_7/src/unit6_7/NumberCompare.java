package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 4/16/18
//Class - Programming 6
//Lab  - Number Compare

import static java.lang.System.*;

public class NumberCompare
{
	private int one, two;

	public NumberCompare()
	{
            one = 0;
            two = 0;
	}

	public NumberCompare(int n1, int n2)
	{
            one = n1;
            two = n2;
	}

	public void setNums(int n1, int n2)
	{
            one = n1;
            two = n2;
	}

	public int getLargest()
	{
		if(one > two)
		   return one;
		else 
		   return two;
	}

	public int getSmallest()
	{
		if(one < two)
                    return one;
                else
                    return two;
	}

	public String toString()
	{
		return one + " -- " + two;
	}
}
