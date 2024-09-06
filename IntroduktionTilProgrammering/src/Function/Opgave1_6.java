package Function;

import java.util.Random;
import java.util.Scanner;

public class Opgave1_6 {

    public static int throwDice() {
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;

        if (dice == 6) {
            System.out.println("6, Lucky you! \uD83C\uDFB2 ");
        }
        return dice;
    }


        public static void main (String[]args){

            throwDice();

        }

    }
