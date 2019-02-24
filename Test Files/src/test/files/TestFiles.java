package test.files;

/**
 *
 * @author jgrant
 */
import java.util.Arrays;
import java.util.ArrayList;

public class TestFiles
{
    public static void main(String[] args)
    {
        //System.out.println(Math.ceil(Math.sqrt(17)));
        //System.out.println(Math.random() * 20 + 10);
        /*int x = 17;
        System.out.println(!(x != 17));
        char letter = 'Q';
        System.out.println(!(letter == 'Q'));
        String bob = "joe";
        System.out.println(!bob.equals("joe"));*/
        //arraysTwo();
        //main();
        //numbers();
        //stringArraysWkst();
        //arraysSAQuizA();
        int[] ran = {1,2,7,8,7,5};
        //System.out.println(run(ran));
        //arrayListWkstOne();
        //arraysWkst();
        /*String name = "josh";
        System.out.println(name.length());*/
        System.out.println(equalToSeven(ran));
    }
    
    public static void stringArraysWkst(){
        String[] ray = {"cba", "jkl", "789", "lof", "asd", "bgt", "pig"};
        ray = "def-527-158-926".split("\\-");
        System.out.println(ray[0]);
        System.out.println(ray[2].replaceAll("[46]", "#"));
    }
    
    public static void arraysSAQuizA(){
        double[] vals = {2.9, 1.1, 3.8, 5.1, 9, 111, 98.1};
        System.out.println(vals[5]);
    }
    
    public static void arrayListWkstOne(){
        ArrayList<String> sam;
        sam = new ArrayList<>();
        ArrayList<Integer> josh;
        josh = new ArrayList<>(3);
        sam.add("ben");
        sam.add(0, "wil");
        sam.add(1, "cat");
        sam.add(1, "dog");
        sam.add("pig");
        System.out.println(sam);
        sam.remove(2);
        System.out.println(sam);
        System.out.println(sam.set(1, "up"));
        System.out.println(sam);
        sam.remove(1);
        System.out.println(sam);
    }
    
    public static void arraysWkst(){
        double[] fun = {2.1,4.5,9.6,4.3,0.0,0.5,1.6};
        System.out.println(fun[5*2/8]);
        System.out.println(fun.length / 2);
    }
    
    public static int equalToSeven(int[] array){
        int count = 0;
        for(int pos = 0; pos < array.length; pos++)
            if(array[pos] == 7)
                count++;
        return count;
    }
    
    public static int run(int[] one){
        int count = 0;
        for(int pos = 0; pos < one.length; pos++)
        {
            if(one[pos] > 5)
            {
                count += one[pos];
            }
        }
        return count;
    }
    
    public static String scrambleWord(String word)
    {
        /* to be implemented in part a */
      
        for(int i = 0; i < word.length()-1; i++)
        {
            if(word.substring(i, i+1).equals("A") && !word.substring(i+1, i+2).equals("A"))
            {
                word = word.substring(0, i) + word.substring(i+1, i+2) + word.substring(i, i+1) + word.substring(i+2);
                i++;
            }
        }
        return word;
    }

   /********************** Test *********************/
   public static void main()
   {
      System.out.println("\nTesting Part (a):\n");

      String[] words = {"TAN", "ABRACADABRA", "WHOA",
                        "AARDVARK", "EGGS", "A", ""};
      for (String word : words)
         System.out.println(word + " becomes " + scrambleWord(word));
   }
   
   public static double[] timesTen(double[] arr)
	{
		double[] product = new double[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
		  arr[i] *= 10;
		  product[i] = arr[i];
		}
		return product;
	}
	
    public static void numbers()
	{
		//feel free to test code here
		double[] numbers = {1.0, 2.5, 3.1};
		System.out.println(numbers);
                System.out.println(numbers[0]);
		System.out.println( timesTen( numbers ) );
                System.out.println(numbers[0]);
	}
}