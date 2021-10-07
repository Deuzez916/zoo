package Exercises_13;

import java.util.Scanner;


public class Exercise_1 {

    
    public static void main(String[] args)
    {
        // Fråga 1
        
        int result = 0; 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Var vänlig och skriv in ett nummer ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            result = result + i;
        }
        System.out.println("summan av dina nummer är " + result);
        
    }
}
