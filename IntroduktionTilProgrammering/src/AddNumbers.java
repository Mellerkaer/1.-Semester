
// DO WHILE LOOP
// OPGAVEN:
// 1. Skriv et program der gør det muligt for brugeren, at skrive to numre
// og få computeren til at give summen af de to.
// 2. Brugeren skal kunne gentage handlingen indtil de er færdige.

import java.util.Scanner;

public class AddNumbers {

    public static void  main(String[] args) {

        Scanner scan = new Scanner(System.in);

            //Her definerer jeg runagain som 0, længere nede bruges runagain igen.
            //Det gør den i forbindelse med brugeren enten taster 1 eller 2
        int runagain = 0;

            // Jeg beder computeren om at køre loopet
        do{
                //Jeg skriver "Skriv første tal" i terminalen
            System.out.println("Skriv første tal");
                //Jeg angiver brugerens første interaktion (som er første tal)
                // og at det skal være en double, fordi vi også gerne vil se eventuelle kommatal
            double number1 = scan.nextDouble();

                //Gentalese af ovenstående.
            System.out.println("Skriv andet tal");
            double number2 = scan.nextDouble();

                //Her udføres multiplikation af de to tal.
            double sum = number1 * number2;
            System.out.println("Sum: " + sum);

            System.out.println("Vil du starte forfra? Skriv 1 for ja og 2 for nej. ");
                //Efter at have fundet resultatet bruges denne kommando til at læse brugerens næste tal.
            runagain = scan.nextInt();

            //Hvis det indtastede tal er 1, så køres programmet igen.
        }while(runagain == 1);

    }
}
