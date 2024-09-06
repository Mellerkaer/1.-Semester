package Inputs;
import java.util.Scanner;

//Stjernetegns opgave med if og else if

public class ZodiacSign {
    public static void main(String[] args) {

        String line;
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv måneden for din fødselsdag (1-12): ");
        int month = sc.nextInt();

        System.out.println("Skriv dagen for din fødselsdag(1-31): ");
        int day = sc.nextInt();

        if (month == 1 && day <= 20) {
            System.out.println("Stenbuk");
        } else if (month == 1 && day > 20 && day <= 31) {
            System.out.println("Vandmand");
        } else if (month == 1 && day > 31) {
            System.out.println("Dickhead");
        }

        if (month ==2 && day <= 18) {
            System.out.println("Vandmand");
        }
        else if (month ==2 && day >= 18) {
            System.out.println("Fisk");
        }

        if (month ==3 && day <= 19) {
            System.out.println("Fisk");
        }
        else if (month ==3 && day >= 19) {
            System.out.println("Vædderen");
        }

        if (month ==4 && day <= 20) {
            System.out.println("Vædderen");
        }
        else if (month ==4 && day >= 20) {
            System.out.println("Tyren");
        }

        if (month ==5 && day <= 21) {
            System.out.println("Tyren");
        }
        else if (month ==5 && day >= 21) {
            System.out.println("Tvillinger");
        }

        if (month ==6 && day <= 20) {
            System.out.println("Tvillinger");
        }
        else if (month ==6 && day >= 20) {
            System.out.println("Krebs");
        }

        if (month ==7 && day <= 22) {
            System.out.println("Krebs");
        }
        else if (month ==7 && day >= 22) {
            System.out.println("Løve");
        }

        if (month ==8 && day <= 22) {
            System.out.println("Løve");
        }
        else if (month ==8 && day >= 22) {
            System.out.println("Jumfru");
        }

        if (month ==9 && day <= 23) {
            System.out.println("Jumfru");
        }
        else if (month ==9 && day >= 23) {
            System.out.println("Vægt");
        }

        if (month ==10 && day <= 23) {
            System.out.println("Vægt");
        }
        else if (month ==10 && day >= 23) {
            System.out.println("Scorpion");
        }

        if (month ==11 && day <= 23) {
            System.out.println("Scorpion");
        }
        else if (month ==11 && day >= 23) {
            System.out.println("Skytten");
        }

        if (month ==12 && day <= 22) {
            System.out.println("Skytten");
        }
        else if (month ==12 && day >= 22) {
            System.out.println("Stenbuk");
        }

    }
}
