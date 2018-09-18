/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author jbeckenbach
 */
import java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class MathQues {
    
    // Write the Math Question Generator here
    public static void main(String[] agrs)
    {
        Scanner keyboard = new Scanner(System.in);
        
        
        //Ask for all the information for each question
        System.out.println("Question 1 needs: ");
        System.out.print("packages > ");
        int x1 = keyboard.nextInt();
        System.out.print("cost per package > ");
        int y1 = keyboard.nextInt();
        System.out.print("cost for single > ");
        int z1 = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Question 2 needs: ");
        System.out.print("total coins > ");
        int x2 = keyboard.nextInt();
        System.out.print("dimes > ");
        int y2 = keyboard.nextInt();
        System.out.print("quarters > ");
        int z2 = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Question 3 needs: ");
        System.out.print("kids on the bus > ");
        int x3 = keyboard.nextInt();
        System.out.print("kids got on bus > ");
        int y3 = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Question 4 needs: ");
        System.out.print("total gallons > ");
        int x4 = keyboard.nextInt();
        System.out.print("used gallons > ");
        double y4 = keyboard.nextDouble();
        System.out.println();
        
        System.out.println("Question 5 needs: ");
        System.out.print("total miles > ");
        int x5 = keyboard.nextInt();
        System.out.print("miles to bridge > ");
        double y5 = keyboard.nextDouble();
        System.out.print("miles to river > ");
        double z5 = keyboard.nextDouble();
        System.out.println();
        
        System.out.println("Question 6 needs: ");
        System.out.print("boxes > ");
        int x6 = keyboard.nextInt();
        System.out.print("sleeves > ");
        int y6 = keyboard.nextInt();
        System.out.print("balls > ");
        int z6 = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Question 7 needs: ");
        System.out.print("children > ");
        int x7 = keyboard.nextInt();
        System.out.print("groups > ");
        int y7 = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Question 8 needs: ");
        System.out.print("packages > ");
        int x8 = keyboard.nextInt();
        System.out.print("plates > ");
        int y8 = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Question 9 needs: ");
        System.out.print("slices of pizza > ");
        int x9 = keyboard.nextInt();
        System.out.print("people > ");
        int y9 = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Question 10 needs: ");
        System.out.print("clips > ");
        int x10 = keyboard.nextInt();
        System.out.print("students > ");
        int y10 = keyboard.nextInt();
        System.out.print("clips in box > ");
        int z10 = keyboard.nextInt();
        System.out.println();
        
        //Print the questions
        System.out.println();
        System.out.println("***************************");
        System.out.println("*********QUESTIONS*********");
        System.out.println("***************************");
        System.out.println();
        
        //Call each method
        double answer1 = crayons(x1, y1, z1);
        int answer2 = coins(x2, y2, z2);
        int answer3 = kids(x3, y3);
        double answer4 = gallons(x4, y4);
        double answer5 = miles(x5, y5, z5);
        int answer6 = golfBalls(x6, y6, z6);
        int answer7 = groups(x7, y7);
        int answer8 = plates(x8, y8);
        int answer9 = pizza(x9, y9);
        int answer10 = paperClips(x10, y10, z10);
        
        
        
        //Print the answers
        System.out.println();
        System.out.println("****************************");
        System.out.println("*********Answer Key*********");
        System.out.println("****************************");
        System.out.println();
        
        //Print returns
        System.out.println("1. " + answer1);
        System.out.println("2. " + answer2);
        System.out.println("3. " + answer3);
        System.out.println("4. " + answer4);
        System.out.println("5. " + answer5);
        System.out.println("6. " + answer6);
        System.out.println("7. " + answer7);
        System.out.println("8. " + answer8);
        System.out.println("9. " + answer9);
        System.out.println("10. " + answer10);
    }
    
    public static double crayons(int packages, int costPerPackage, int costForOne)
    {
        System.out.println("Jill bought " + packages + " packages of crayons for " + 
                costPerPackage + " cents each. \n" +
                "She also bought one package of crayons for " + costForOne +
                "\nHow much did Jill spend? \n");
        return ((packages * costPerPackage) + costForOne) / 100.0;
    }
    
    public static int coins(int total, int dimes, int quarters)
    {
        System.out.println("Joe collects coins.  He has " + total + " coins in his collection. \n" + 
                "There are " + dimes + " dimes and " + quarters + " quarters.  The rest are \n" + 
                "pennies.  How many pennies does he have? \n");
        return total - dimes - quarters;
    }
    
    public static int kids(int kidsOnBus, int kidsGotOnBus)
    {
        System.out.println("When Alex got on the school bus, there were " + kidsOnBus + " other children \non the bus.  " + 
                "At the next stop, " + kidsGotOnBus + " more children got on the bus." + 
                "\nHow many children were now on the bus? \n");
        return kidsOnBus + kidsGotOnBus;
    }
    
    public static double gallons(int totalGallons, double usedGallons)
    {
        System.out.println("Pam's car holds " + totalGallons + " gallons of gasoline.  After filling \nthe tank, " + 
                "she drove to the beach.  She had used " + usedGallons + " gallons.  " + 
                "\nHow many gallons are left in her gas tank? \n");
        return totalGallons - usedGallons;
    }
    
    public static double miles(int waterfall, double river, double bridge)
    {
        System.out.println("Ed and Jason are hiking " + waterfall + " miles to a waterfall.  They walk \n" + bridge + 
                " miles to a bridge.  Then they walked " + river + " miles to a river.  \nHow much father do " + 
                "they have to walk to the waterfall? \n");
        return waterfall - river - bridge;
    }
    
    public static int golfBalls(int boxes, int sleeves, int balls)
    {
        System.out.println("Ruth, Roz, and Gladys bought " + boxes + " boxes of golf balls.  Each \n" + 
                "box contains " + sleeves + " sleeves of " + balls + " balls in each.  How many golf " +
                "\nballs will each person get? \n");
        return (balls * sleeves * boxes) / 3;
    }
    
    public static int groups(int kids, int groups)
    {
        System.out.println("There are " + kids + " children in the art club.  The teachput them \n" + 
                "into " + groups + " groups.  Approximately how many children per group \nshould there be? \n");
        return kids / groups;
    }
    
    public static int plates(int plates, int packages)
    {
        System.out.println("Patty bought " + plates + " packages of paper plates.  There were " + plates + 
                " \nplates in each package.  How many plates did she buy? \n");
        return packages * plates;
    }
    
    public static int pizza(int slices, int people)
    {
        System.out.println("There are " + slices + " slices of pizza.  If " + people + " people each take \n" + 
                "the same number of slices of pizza until there aren't \nenough left for them each \n" + 
                "to take a piece, how many \nslices of pizza would be left? \n");
        return slices % people;
    }
    
    public static int paperClips(int clipsPerPerson, int students, int clipsInBox)
    {
        System.out.println("We are going to use paper clips for measuring.  Each \nstudent will get " + clipsPerPerson + 
                " clips.  There are " + students + " sutdents in \nthe class.  There are " + clipsInBox + " clips in each " + 
                "box.  \nHow many boxes will we need? \n");
        return (clipsPerPerson * students) / clipsInBox;
    }
}
