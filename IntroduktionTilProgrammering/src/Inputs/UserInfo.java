package Inputs;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

        String line;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv dit navn: ");
        String navn = scanner.nextLine();
        System.out.println("Skriv din yndlingsfarve: ");
        String farve = scanner.nextLine();
        System.out.println("Dit navn er " + navn + " og din yndlingsfarve er " + farve);

    }

}
