package Exercises_12;

import java.util.Scanner;

public class Exercises_12_all
{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        // Fråga 1
        
        Scanner input = new Scanner(System.in);
        System.out.println("Var vänlig och skriv ett nummer");
        int nummer1 = input.nextInt();
        int i;
        for (i = 1; i <= nummer1;  i++)
        {
            System.out.println(i);
        }
        
        System.out.println("");
        
        // Fråga 2
        
        System.out.println("Skriv ett nummer");
        int nummer2 = input.nextInt();
        int o = 0;
        while (o <= nummer2)
        {
            System.out.println(o);
            o++;
        }
        
        System.out.println("");
        
        // Fråga 3
        
        int p = 0;
        while (p <= 10)
        {
            System.out.println(p);
            p++;
            p++;
        }
        
        System.out.println("");
        
        // Fråga 4
        
        System.out.println("Var Vänlig och skriv ett nummer som är "
                + "positivt och är jämt");
        int nummer3 = input.nextInt();
        int q = 0;
        if(nummer3 % 2 == 0)
            while (q <= nummer3)
        {
            System.out.println(q);
            q++;
            q++;
        }
        else
        {
            System.out.println("Ditt nummer är ojämt");
        }
        
        System.out.println("");
        
        // Fråga 5
        
        System.out.println("Var vänlig och skriv in ett nummer som "
                + "är positivt");
        int nummer4 = input.nextInt();
        int z = 1;
        if(nummer4 % 2 == 0)
            while(z <= nummer4)
        {
            System.out.println(z);
            z++;
            z++;
        }
        else
            while(z <= nummer4)
        {
            System.out.println(z);
            z++;
        }
      
        System.out.println("");
        
        // Fråga 6
        
        System.out.println("Var vänlig och skriv in ett nummer");
        int nummer5 = input.nextInt();
        int x;
        for (x = 0; x <= nummer5;  x++)
        {
            System.out.println(x + " * " + x * nummer5);
        }
        
        System.out.println("");
        
        // Fråga 7
        
        System.out.println("Var vänlig och skriv in ett nummer");
        int nummer6 = input.nextInt();
        for (int c = 0; c < nummer6; c++)
        {
            System.out.println(c * 3);
        }
        
        System.out.println("");
        
        // Fråga 8
        
        System.out.println("Var vänlig och skriv in två nummer");
        int nummer7 = input.nextInt();
        int nummer8 = input.nextInt();
        for (int m = 1; m <= nummer8; m++)
        {
            System.out.println(m + " * " + nummer7 + " = " + m * nummer7);
        }
        
        System.out.println("");
        
        // Fråga 9
        
        System.out.println("Var vänlig och skriv in 10 nummer.");
        int p0 = input.nextInt();
        int p1 = input.nextInt();
        int p2 = input.nextInt();
        int p3 = input.nextInt();
        int p4 = input.nextInt();
        int p5 = input.nextInt();
        int p6 = input.nextInt();
        int p7 = input.nextInt();
        int p8 = input.nextInt();
        int p9 = input.nextInt();
        if (p0 > p1 && p0 > p2 && p0 > p3 && p0 > p4 && p0 > p5 
                && p0 > p6 && p0 > p7 && p0 > p8 && p0 > p9)
        {
            System.out.println(p0);
        }
        else if (p1 > p0 && p1 > p2 && p1 > p3 && p1 > p4 && p1
                > p5 && p1 > p6 && p1 > p7 && p1 > p8 && p1 > p9)
        {
            System.out.println(p1);
        }
        else if (p2 > p1 && p2 > p0 && p2 > p3 && p2 > p4 && p2
                > p5 && p2 > p6 && p2 > p7 && p2 > p8 && p2 > p9)
        {
            System.out.println(p2);
        }
        else if (p3 > p1 && p3 > p2 && p3 > p0 && p3 > p4 && p3
                > p5 && p3 > p6 && p3 > p7 && p3 > p8 && p3 > p9)
        {
            System.out.println(p3);
        }
        else if (p4 > p1 && p4 > p2 && p4 > p3 && p4 > p0 && p4
                > p5 && p4 > p6 && p4 > p7 && p4 > p8 && p4 > p9)
        {
            System.out.println(p4);
        }
        else if (p5 > p1 && p5 > p2 && p5 > p3 && p5 > p4 && p5
                > p0 && p5 > p6 && p5 > p7 && p5 > p8 && p5 > p9)
        {
            System.out.println(p5); 
        }
        else if (p6 > p1 && p6 > p2 && p6 > p3 && p6 > p4 && p6
                > p5 && p6 > p0 && p6 > p7 && p6 > p8 && p6 > p9)
        {
            System.out.println(p6);
        }
        else if (p7 > p1 && p7 > p2 && p7 > p3 && p7 > p4 && p7
                > p5 && p7 > p6 && p7 > p0 && p7 > p8 && p7 > p9)
        {
            System.out.println(p7);
        }
        else if (p8 > p1 && p8 > p2 && p8 > p3 && p8 > p4 && p8
                > p5 && p8 > p6 && p8 > p7 && p8 > p0 && p8 > p9)
        {
            System.out.println(p8);
        }
        else if (p9 > p1 && p9 > p2 && p9 > p3 && p9 > p4 && p9 > p5
                && p9 > p6 && p9 > p7 && p9 > p8 && p9 > p0)
        {
            System.out.println(p9);
        }
    }
    
}
