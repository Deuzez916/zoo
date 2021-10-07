package Exercises_11;

import java.util.Scanner;

    public class Exercises_11_all 
    {   
        //Fråga 1
        public static void main(String[] args) 
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Var vänlig och skriv in ett nummer mellan "
                    + "1-10"); 
            Double nummer = input.nextDouble();
            if (nummer <= 10 && nummer >= 1)
            {
                System.out.println("Ditt nummer är " + Math.round(nummer));
            }
            else
            {
                System.out.println(" Ditt nummer är större än 10 eller mindre "
                        + "än 1");
            }
            
            System.out.println("");
            
            // Fråga 2
            
            System.out.println("Var vänlig och skriv in två nummer. Dessa"
                    + " nummer får inte vara samma.");
            double nummer1 = input.nextDouble();
            double nummer2 = input.nextDouble();
            if (nummer1 != nummer2)
            {
                if(nummer1 < nummer2)
                {
                    System.out.println("Dina tal är " + Math.round(nummer1) 
                            +" och " + Math.round(nummer2));
                }
                else
                {
                    System.out.println("Dina tal är " + Math.round(nummer2) 
                            + " och " + Math.round(nummer1));
                }
            }
            else
            {
                System.out.println("Dina tal är samma!");
            }
            
            System.out.println("");
            
            // Fråga 3
            
            System.out.println("Var vänlig och skriv in tre nummer. Dessa"
                    + " nummer får inte vara samma.");
            double x1 = input.nextDouble();
            double x2 = input.nextDouble();
            double x3 = input.nextDouble();
            if (x1 != x2 && x1 != x3 && x2 != x3)
            {
                if(x1 < x2 && x1 < x3 && x2 < x3)
                {
                    System.out.println("Dina tal storleks ordning är " 
                            + Math.round(x1) 
                            +", " + Math.round(x2) + ", " + Math.round(x3));
                }
                else if(x1 < x2 && x1 < x3 && x3 < x2)
                {
                    System.out.println("Dina tal storleks ordning är " 
                            + Math.round(x1) + ", " + Math.round(x3) 
                            + ", " + Math.round(x2));
                }
                else if(x2 < x1 && x2 < x3 && x1 < x3)
                {
                    System.out.println(" Dina tal i storleks ordning är "
                            + Math.round(x2) + ", " + Math.round(x1) 
                            + ", " + Math.round(x3));
                }
                else if(x2 < x1 && x2 < x3 && x3 < x1)
                {
                    System.out.println(" Dina tal i storleks ordning är "
                            + Math.round(x2) + ", " + Math.round(x3) 
                            + ", " + Math.round(x1));
                }
                else if(x3 < x1 && x3 < x2 && x1 < x2)
                {
                    System.out.println(" Dina tal i storleks ordning är "
                            + Math.round(x3) + ", " + Math.round(x1) 
                            + ", " + Math.round(x2));
                }
                else if(x3 < x1 && x3 < x2 && x2 < x1)
                {
                    System.out.println(" Dina tal i storleks ordning är "
                            + Math.round(x3) + ", " + Math.round(x2) 
                            + ", " + Math.round(x1));
                }
            }
            else
            {
                System.out.println("Dina tal är samma!");
            }
            
            System.out.println("");
            
            // Fråga 4
            
            int x = 10;
            int y = 15;
            int z = x + y - 5;
            if (x == 10 && y == 15)
            {
                z = 20;
            }
            
            System.out.println("");
            
            // Fråga 5
            
            System.out.println("Var vänlig och skriv in ett nummer. (Ditt"
                    + " nummer måste vara högre än 0)");
            int X = input.nextInt();
            if(X % 2 == 0)
            {
                System.out.println("Ditt nummer är jämt");
            }
            else
            {
                System.out.println("Ditt nummer är ojämt");
            }
            
            System.out.println("");
            
            // Fråga 6
            
            System.out.println("Var vänlig och skriv in ett nummer.");
            double nr = input.nextDouble();
            boolean a = true;
            boolean b = false;
            if(nr >= 1)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
            
            
            
        }          
    }