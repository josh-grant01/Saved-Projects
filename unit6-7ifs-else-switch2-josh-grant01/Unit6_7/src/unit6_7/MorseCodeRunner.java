package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 4/21/18
//Class - Programming 6
//Lab  - Morse Code

import static java.lang.System.*; 

public class MorseCodeRunner
{
	public static void main( String args[] )
	{
            //add test cases
            
            MorseCode test = new MorseCode('A');
            out.println(test.getMorseCode());
            out.println(test);
            
            test.setChar('B');
            out.println(test.getMorseCode());
            out.println(test);
            
            test.setChar('3');
            out.println(test.getMorseCode());
            out.println(test);
            
            test.setChar('Z');
            out.println(test.getMorseCode());
            out.println(test);
            
            test.setChar('8');
            out.println(test.getMorseCode());
            out.println(test);
            
            test.setChar('F');
            out.println(test.getMorseCode());
            out.println(test);
            
            test.setChar('0');
            out.println(test.getMorseCode());
            out.println(test);
	}
}