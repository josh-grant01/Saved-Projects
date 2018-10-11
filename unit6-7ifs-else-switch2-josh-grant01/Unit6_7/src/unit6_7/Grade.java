package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 4/21/18
//Class - Programming 6
//Lab  - Grade Check

import static java.lang.System.*; 

public class Grade
{
	private int numGrade;

	public Grade()
	{
            numGrade = 0;
	}

	public Grade(int grade)
	{
            numGrade = grade;
	}

	public void setGrade(int grade)
	{
            numGrade = grade;
	}

	public String getLetterGrade( )
	{
            String letGrade = "";
            if(numGrade >= 70)
                if(numGrade >= 75)
                    if(numGrade >= 80)
                        if(numGrade >= 90)
                            letGrade = "A";
                        else
                            letGrade = "B";
                    else
                        letGrade = "C";
                else
                    letGrade = "D";
            else
                letGrade = "F";
            return letGrade;
	}

	public String toString()
	{
		return numGrade + " is a " + getLetterGrade() + "\n";
	}
}