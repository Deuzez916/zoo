package Exercises_10;

import java.util.Scanner;

    public class Exercises_10_all 
    {
        // Fråga 1
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Var vänlig skriv in ditt namn");
            String namn = input.nextLine();
            System.out.println("Stämmer det att ditt namn är " + namn);
            
            System.out.println("");
            
            // Fråga 2 
     
            System.out.println("var vänlig och skriv in ett nummer");
            double nummer = input.nextInt();
            nummer=Math.sqrt(nummer);
            System.out.println("Roten ur " + nummer  );
      
            System.out.println("");
            
            // Fråga 3
            
            System.out.println("Var vänligen skriv in 3 nummer:");
            double ett = input.nextInt();
            double två = input.nextInt();
            double tre = input.nextInt();
            double summa = ett + två + tre;
            System.out.println("Genomsnittet på dina nummer är: " + Math.round(summa / 3));
            
            System.out.println("");
            
            // Fråga 4
            
            System.out.println("Var vänlig och skriv en radie på en cirkel "
                    + "/(cm/)");
            double r = input.nextDouble();
            double area = (r * r) * Math.PI;
            System.out.println("Arean på cirkeln är: " + Math.round(area));
            
            System.out.println("");
            
            // Fråga 5
            
            System.out.println("Var vänlig skriv ut hur lång sträckan är "
                    + "mellan A och B /(Km/). För att programmet ska räkna "
                    + "ut hur lång restiden är.");
            double km = input.nextDouble();
            int kmh = 90;
            System.out.println("Din resa skulle ungefär vara " + 
                    Math.round(km / kmh) + "h");
            
            System.out.println("");
            
            // Fråga 6 
            
            System.out.println("Hur mycket kostar produkten utan "
                    + "sänkningen?");
            double kr = input.nextDouble();
            System.out.println("Hur mycket har priset sänkts med i procent?");
            double procent = input.nextDouble();
            double sänkning = (kr/100) * procent;
            double nytt_pris = kr - sänkning;
            System.out.println("Det nya priset är " + Math.round(nytt_pris)
                    + "kr");
            
            System.out.println("");
            
            // Fråga 7
            
            System.out.println("");
        }
    }
