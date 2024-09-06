package Inputs;
 import java.util.Scanner;

public class Moller {
    public static void main (String[] args) {
        String line;

        Scanner input = new Scanner(System.in);
        System.out.print("Alt er ? ");

        line = input.nextLine();

        for (int i = 0; i <= 3; i++)
        System.out.println(line);

    }
}
