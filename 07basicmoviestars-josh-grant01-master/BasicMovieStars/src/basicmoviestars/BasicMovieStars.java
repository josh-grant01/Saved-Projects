/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//follow directions from the lab
package basicmoviestars;

public class BasicMovieStars {

  
    public static void main(String[] args)
    {
        // TODO code application logic here
        //adding a comment
        String actorName = "Tom Holland";
        char actorGender = 'M';
        int actorAge = 22;
        String actorBday = "June 1, 1996";
        String actorBestAppearance = "Spiderman";
        String actorBio = "Born in Kingston upon Thames, London, Tom is one of four children.  "
                + "He attended The BRIT School for Performing Arts and Technology.  "
                + "Has worked for two years in Billy the musical.  Now plays the role of Spiderman";
        String actressName = "Gal Gadot";
        char actressGender = 'F';
        int actressAge = 33;
        String actressBday = "April 30, 1985";
        String actressBestAppearance = "Wonder Woman";
        String actressBio = "Born in Petah Tikva, Israel, She won the 2004 Israel beauty pagaent.  "
                + "She since then has been an actress.";
        
        System.out.println("Here's some information on my favorite actor and actress:\n");
        System.out.println("Favorite Actor: " + actorName);
        System.out.println("Gender: " + actorGender);
        System.out.println("Age: " + actorAge);
        System.out.println("Birthday: " + actorBday);
        System.out.println("Best Appearance: " + actorBestAppearance);
        System.out.println("Short Biography: " + actorBio);
        System.out.println("\nFavorite Actress: " + actressName);
        System.out.println("Gender: " + actressGender);
        System.out.println("Age: " + actressAge);
        System.out.println("Birthday: " + actressBday);
        System.out.println("Best Appearance: " + actressBestAppearance);
        System.out.println("Short Biography: " + actressBio);
    }
    
}
