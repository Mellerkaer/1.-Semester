package Function;

public class LearningFunction {

    public static void dublicateNumber(int num) {

        System.out.println("We are en dublicateNumber " + num*2);
    }

    public static int gangNumber(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("We are in gangNumbers " + result);
        return result;
    }

    public static void main(String[] args) {
        int number = 50;
        int result = 0;
        dublicateNumber(number);
        result = gangNumber(5,4);
        System.out.println("We are in main " + result);

    }

}
