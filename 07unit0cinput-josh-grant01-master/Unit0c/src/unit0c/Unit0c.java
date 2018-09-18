/*
 * ProjectName: 
 * Author:
 * Date:
 * Purpose:
 */
package unit0c;

/**
 *
 * @author 
 */

import static java.lang.System.*;
import java.util.Scanner;

public class Unit0c
{

    /**
     * @param args the command line arguments
     */    
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double One, Two;
        double Total = 0.0;
        String Name;
        
     //welcome your user to your program
        System.out.println("Welcome to the Math Program!");
        
     //Ask user their name 
        System.out.print("What is your name? :: ");
        Name = keyboard.nextLine();
    //Echo their name back and greet them
        System.out.println("Hello " + Name + "!  Nice to meet you!");
        
    //Ask the user to enter a number 
        System.out.print("Enter a number :: ");
        One = keyboard.nextDouble();
    //Ask the user to enter a second number 
        System.out.print("Enter a second number :: ");
        Two = keyboard.nextDouble();
    //Take the two numbers and do math - options %,+,-,/,*
        Total = One + Two;
    
    //Tell the user the numbers they entered and the answer ex 
    //Your answer is: 1+1=2
        System.out.println(One + " + " + Two + " = " + Total);
    
    //Thank the user by name for playing.
        System.out.println("Thanks for playing " + Name + "!");
    }
    
}
