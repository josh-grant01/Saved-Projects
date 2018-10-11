package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 4/21/18
//Class - Programming 6
//Lab  - Dictionary

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
        private int compare;

	public WordsCompare()
	{
            wordOne = "";
            wordTwo = "";
	}

	public WordsCompare(String one, String two)
	{
            wordOne = one;
            wordTwo = two;
	}

	public void setWords(String one, String two)
	{
            wordOne = one;
            wordTwo = two;
	}

	public void compare()
	{
            compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}
