package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 4/16/18
//Class - Programming 6
//Lab  - Unit6_7

import static java.lang.System.*;

public class WordFun
{
	private String word;

	public WordFun()
	{
            word = "";
	}

	public WordFun(String w)
	{
            word = w;
	}

	public void setWord(String w)
	{
            word = w;
	}

	public void makeUpper()
	{
            word = word.toUpperCase() + "\n";
            out.println(word);
	}

	public void addHyphen()
	{
            int loc;
            out.println(word.replaceAll(" ", "-") + "\n");
	}

	public String toString()
	{
		return word + "\n";
	}
}