package Function;

public class Opgave1_2 {

    public static String printLinje(String name) {
        for (int i = 1; i <= 2; i++) {
            System.out.print(name);

        }
        return name;
    }

    public static void main(String[] args) {
        String a = printLinje("hej");

    }
}
