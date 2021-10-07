package Exercises_13;

import java.util.Scanner;

public class Exercise_2
{
    public static void main(String[] args)
    {
    // Fråga 2
    
        double balance = 5000;
        System.out.println("Enter amount to withdraw");
        Scanner input = new Scanner(System.in); 
        double withdraw = input.nextDouble();
        boolean check = withdrawAmount(withdraw, balance);
        if (check)
        {
            balance = balance - withdraw;
            System.out.println("OK");
        }
        else
        {
            System.out.println("Not enough funds!");
        }
    }
    
    static boolean withdrawAmount(double out, double amount)
    {
        return (out < amount);
    }
}
