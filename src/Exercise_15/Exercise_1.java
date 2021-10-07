package Exercise_15;

import java.util.Scanner;

public class Exercise_1
{
    public static void main(String[] args)
    {
        int[] numbers = new int[5];
        
        Scanner input = new Scanner(    System.in);
        System.out.println("Enter 5 numbers: ");
        
        for (int i = 0; i < 5; i++)
        {
            numbers[i] = input.nextInt();
        } 
        
        for(int i : numbers)
        {
            System.out.print(i + ", ");
        }
        System.out.println("");
        
        highest_number(numbers);
        sum(numbers);
        avg(numbers);
    }
    
    public static void sum(int[] array)
    {
        double total = 0;
        for (int number : array)
            total = total + number;
        System.out.println("Sum: " + total);
    }
    
    public static void highest_number(int[] array)
    {
        int biggest = array[0];
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > biggest) biggest = array[i];
        }
        System.out.println("Largest: " + biggest);
    }
    
    public static void avg(int [] array)
    {
        double total = 0;
        for(int number : array)
            total = total + number;
        System.out.println("Average: " + total / array.length);
    }
}
