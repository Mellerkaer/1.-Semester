package Function;

public class Opgave1_5 {

    public static int amountOfLetters (String s) {
        return String.valueOf(s.charAt(0)).length();

    }

    public static void main(String[] args) {
        System.out.println(amountOfLetters("abc"));

    }

}
