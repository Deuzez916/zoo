package Exercise_14;

import java.util.Scanner;

public class Exercise_3_b
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a sentence");
        Scanner input = new Scanner(System.in);
        
        while (true)
        {
            String s = input.nextLine();
            
            String cont = s.toLowerCase();
            if (cont.equals("q") || cont.equals("quit")) break;
            
            for (int i = 0; i < s.length(); i++)
            {
                if (s.codePointAt(i) >= 65 && s.codePointAt(i) <= 90)
                {
                    System.out.println(i + " ");
                }
            }
            System.out.println();
        }
    }
}
