package apunit2returns;
//(c) A+ Computer Science  -  www.apluscompsci.com
//Name - Josh Grant
//Date - 10-8-18
//Class - AP CSA
//Lab  - Trapezoid Area

public class Trap
{
	public static double area( int base1, int base2, int height )
	{
            double trap;
            trap = 0.5 * (base1 + base2) * height;
            return trap;
	}
}
//The program did not like dividing with fractions