package Function;

import java.util.Scanner;

public class Opgave1_7 {

    Scanner sc = new Scanner(System.in);

    String firstName = sc.nextLine();
    String lastName = sc.nextLine();
    boolean gender = sc.nextBoolean();

    public String getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public boolean getGender(boolean gender) {
        if (gender) {
            gender = true;
            System.out.println("Mr");
        }
        else { gender = false; System.out.println("Ms"); }
        return gender;
    }


    public static void main(String[] args) {
        System.out.println("Skriv dit fornavn:");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        System.out.println("Skriv dit efternavn: ");
        String lastName = sc.nextLine();
        System.out.println("Er du en mand? ");
        boolean gender = sc.nextBoolean();
        System.out.println("Dit fulde navn er: ");
        System.out.println(getGender(gender) + getFullName(firstName, lastName));

    }

}
