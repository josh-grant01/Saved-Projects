package unit5ifs;
//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Joshua Grant
//Date - 2-16-18
//Class - Programmming 6
//Lab  - Distance Formula

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
            setCoordinates(0, 0, 0, 0);
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
            x1 = xOne;
            y1 = yOne;
            x2 = xTwo;
            y2 = yTwo;
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
            x1 = xOne;
            y1 = yOne;
            x2 = xTwo;
            y2 = yTwo;
	}

	public String determineClosest( )
	{
            double distanceA = 0.0, distanceB = 0.0;
            String result = "";
            distanceA = Math.sqrt(Math.pow((0 - (x1)), 2) + Math.pow((0 - (y1)), 2));
            distanceB = Math.sqrt(Math.pow((0 - (x2)), 2) + Math.pow((0 - (y2)), 2));
            //out.println(distanceA);
            //out.println(distanceB);
            if(distanceA < distanceB)
            {
                result = "A is closer to (0,0).";
                return result;
            }
            else
            {
                result = "B is closer to (0,0).";
                return result;
            }
            
	}
	
	public String toString()
	{
            return "";
	}
}