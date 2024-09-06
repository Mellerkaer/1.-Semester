package Inputs;

import java.util.Scanner;

    public class Cookies2 {

        public static void main(String[] args) {

            System.out.println("Hvor mange cookies vil du lave? ");
            Scanner scanner = new Scanner(System.in);
            int cookies = scanner.nextInt();
            double mel = (cookies * 12.5);
            System.out.println("Du skal bruge " + mel + " gram mel, for at lave " + cookies + " Cookies");
        }
    }