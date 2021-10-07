package Exercise_14;

import java.util.Scanner;

public class Exercise_3_a
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        for (int i = 0; i < s.length(); i++)
        {
            if (s.codePointAt(i) >= 65 && s.codePointAt(i) <= 90)
            {
                System.out.print(i + " ");
            }
        }
    }
}
