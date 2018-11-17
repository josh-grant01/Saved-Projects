package test.files;

/**
 *
 * @author jgrant
 */
public class TestFiles
{
    public static void main(String[] args)
    {
        //System.out.println(Math.ceil(Math.sqrt(17)));
        //System.out.println(Math.random() * 20 + 10);
        int x = 17;
        System.out.println(!(x != 17));
        char letter = 'Q';
        System.out.println(!(letter == 'Q'));
        String bob = "joe";
        System.out.println(!bob.equals("joe"));
    }
}
