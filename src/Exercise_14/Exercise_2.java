package Exercise_14;

public class Exercise_2
{
    public static void main(String[] args)
    {
        int startBigChar = 64;
        int endBigChar = 90;
        int startSmallChar = 97;
        int endSmallChar = 122;
                
        for (int i = startBigChar; i <= endBigChar; i++) 
        {
            System.out.println((char) i + " = " + i);
        }
        
        System.out.println(" ");
        
        for (int i = startSmallChar; i <= endSmallChar; i++)
        {
            System.out.println((char) i + " = " + i);
        }
    }
}
