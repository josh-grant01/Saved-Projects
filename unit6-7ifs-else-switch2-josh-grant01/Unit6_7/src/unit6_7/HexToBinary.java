package unit6_7;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Josh Grant
//Date - 4/21/18
//Class - Programming 6
//Lab  - Hex To Binary

import static java.lang.System.*; 

public class HexToBinary
{
	private char hex;

	public HexToBinary()
	{
            setHex(' ');
	}

	public HexToBinary(char hexNum)
	{
            setHex(hexNum);
	}

	public void setHex(char hexNum)
	{
            hex = hexNum;
	}

	public String getBinary()
	{
            String value = "";
            switch(hex)
            {
                case 'A' : value = "1010"; break;
                case 'B' : value = "1011"; break;
                case 'C' : value = "1100"; break;
                case 'D' : value = "1101"; break;
                case 'E' : value = "1110"; break;
                case 'F' : value = "1111"; break;
                default : value = "ERROR"; break;
            }
            return value;
	}

	public String toString()
	{
            return hex + " is " + getBinary() + " in binary!\n";
	}
}