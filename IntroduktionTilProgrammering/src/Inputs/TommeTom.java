package Inputs;

import java.util.Scanner;

public class TommeTom {

    public static void main(String[] args) {

        System.out.println("Hvor mange tommer vil du have i centimeter? ");
        Scanner scanner = new Scanner(System.in);
        int tommer = scanner.nextInt();
        double centimeter = (tommer*2.54);
        System.out.println(tommer + " tommmer svare til " + centimeter + " centimeter");

    }
}
