package Exercise_15;

import java.util.Scanner;

public class Exercise_2
{
    public static void main(String[] args)
    {
        int[] num = new int[10];
        int result;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers between 1 - 100: "); 
        
        int i = 0;
        while (i < 10)
        {
            int n = input.nextInt();

            if (n < 1 || n > 100)
            {
                System.out.println("Try again");
            }
            else
            {
                num[i] = n;
                i = i + 1;
            }
        }
        
        System.out.println("Enter a number: ");
        int check = input.nextInt();
        
        result = search(num, check);
        
        if (result == -1)
        {
            System.out.println("Number was not found in the array.");
        }
        else
        {
            System.out.println(" Number was found in the array.");
        }
        
        for(int s : num)
        {
            System.out.println(s);
        }
    }
    
    static int search(int[] A, int m)
    {
        for (int i = 0; i < A.length; i++)
        {
            if(A[i] == m) return i;
        }
        return -1;
    }
}
