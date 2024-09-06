package Function;

    //Learning functions

import java.util.Scanner;

public class AnnounceTeaTime {

    public static void announceTeaTime() {
        System.out.println("waiting for teatime... ");
        System.out.println("Type a random word: ");
        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.println("It's tea time! ");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job! ");
        announceTeaTime();

        System.out.println("Write code ");
        System.out.println("review code ");
        System.out.println("Learn stuff! ");

        announceTeaTime();

        System.out.println("Get promoted ");

    }

}
