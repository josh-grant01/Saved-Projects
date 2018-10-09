package apunit2returns;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Josh Grant
//Date - 10-5-18

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
            double slope;
            slope = ((double) y2 - y1) / ((double) x2 -x1);
            return slope;
	}
}