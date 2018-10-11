package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 4/21/18
//Class - Programming 6
//Lab  - Hex To Binary

import static java.lang.System.*; 
import java.util.Scanner;

public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
            //add test cases
            
            Scanner keyboard = new Scanner(System.in);
            
            int count = 1;
            while(count <= 7)
            {
                out.print("Enter a letter :: ");
                char hexNum = keyboard.next().charAt(0);
                
                HexToBinary test = new HexToBinary();
                test.setHex(hexNum);
                test.getBinary();
                out.println(test);
                
                count ++;
            }
	}
}