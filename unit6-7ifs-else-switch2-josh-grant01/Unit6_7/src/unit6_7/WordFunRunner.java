package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 4/16/18
//Class - Programming 6
//Lab  - Unit6_7

import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
	   WordFun test = new WordFun("Hello World");
	   out.println(test);
	   test.makeUpper();
	   //out.println(test);
	   test.addHyphen();
	   //out.println(test);

	   //add more test cases
           test.setWord("Jim Bob");
           out.println(test);
           test.makeUpper();
           test.addHyphen();
           
           test.setWord("Computer Science");
           out.println(test);
           test.makeUpper();
           test.addHyphen();
           
           test.setWord("UIL TCEA");
           out.println(test);
           test.makeUpper();
           test.addHyphen();
           
           test.setWord("State Champions");
           out.println(test);
           test.makeUpper();
           test.addHyphen();
           
           
	}
}
