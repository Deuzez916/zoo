package Exercises_13;

import java.util.Scanner;

   public class Exercise_3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size>");
        int size = in.nextInt();
        for (int j = 0; j < size; j++)
        {
           if (j == 0 || j == size - 1)
            {
               lineOfStars(size);
            }
            else    
            {
                blankLine(size);
            }
            System.out.println();
        }
    }
    static void lineOfStars(int width)
    {
        for (int i = 0; i < width; i++)
        {
            System.out.print("*");
        }
    }
    static void blankLine(int width)
    {
        System.out.print("*");
        for (int i = 0; i < width - 2; i++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
    }
}