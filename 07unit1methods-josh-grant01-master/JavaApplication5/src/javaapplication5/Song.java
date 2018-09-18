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
public class Song {
    
    // Write the song program here
    public static void main(String[] args)
    {
        System.out.println("Come on, come on, turn the radio on\n" +
                "It's Friday night and I won't be long\n" +
                "Gotta do my hair, I put my make up on\n" +
                "It's Friday night and I won't be long\n");
        chours();
        chours1();
        System.out.print("Come on, come on, turn the radio on\n" +
                "It's Saturday and I won't be long\n" +
                "Gotta paint my nails, put my high heels on\n" +
                "It's Saturday and I won't be long\n\n");
        chours();
        chours1();
        lastChours();
        chours1();
        int count = 0;
        while (count < 4)
        {
            lastLine();
            count ++;
        }
    }
    
    public static void chours()
    {
        System.out.println("'Til I hit the dance floor\n" +
                "Hit the dance floor\n" +
                "I got all I need\n" +
                "No I ain't got cash\n" +
                "I ain't got cash\n" +
                "But I got you baby\n");
    }
    
    public static void chours1()
    {
        System.out.println("Baby I don't need dollar bills to have fun tonight\n" +
                "(I love cheap thrills!)\n" +
                "Baby I don't need dollar bills to have fun tonight\n" +
                "(I love cheap thrills!)\n" +
                "But I don't need no money\n" +
                "As long as I can feel the beat\n" +
                "I don't need no money\n" +
                "As long as I keep dancing\n");
    }
    
    public static void lastChours()
    {
        System.out.println("I don't need no money\n" +
                "As long as I can feel the beat\n" +
                "I don't need no money\n" +
                "As long as I keep dancing\n" +
                "Oh, oh\n");
    }
    
    public static void lastLine()
    {
        System.out.println("La, la, la, la, la, la, la (I love cheap thrills)");
    }
}
