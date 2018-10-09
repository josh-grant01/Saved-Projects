package apunit2returns;
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Josh Grant
//Date - 10-8-18
//Class - AP CSA
//Lab  - Cone Volume

public class Cone
{
	public static double volume( double radius, int height)
	{		
            double volumeOfCone;
            volumeOfCone = (0.33333 * 3.14159 * Math.pow(radius, 2) * height );
            return volumeOfCone;
	}
}
//The program did not like dividing with fractions