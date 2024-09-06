package Function;

import java.util.Scanner;

public class Opgave1_3 {

    public static double beregnBMI(double weight, double height) {

        double bmi = weight / (height*height);
        return bmi;
    }

    public static void main(String[] args) {
        double BMI = beregnBMI(76 , 1.77);
        System.out.println(BMI);

    }

}
