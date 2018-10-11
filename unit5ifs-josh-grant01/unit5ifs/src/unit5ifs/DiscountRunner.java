package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Grant
//Date - 2-14-18
//Class - Programming 6
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
                
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
                out.println("Bill after discount :: " + String.format("%.2f" ,Discount.getDiscountedBill(amt)) + "\n");
                
                out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
                out.println("Bill after discount :: " + String.format("%.2f" ,Discount.getDiscountedBill(amt)) + "\n");
                
                out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
                out.println("Bill after discount :: " + String.format("%.2f" ,Discount.getDiscountedBill(amt)) + "\n");
                
                out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
                out.println("Bill after discount :: " + String.format("%.2f" ,Discount.getDiscountedBill(amt)) + "\n");
                
                out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
                out.println("Bill after discount :: " + String.format("%.2f" ,Discount.getDiscountedBill(amt)) + "\n");
        }
}