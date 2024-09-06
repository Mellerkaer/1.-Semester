package ForLoop_WhileLoop;

public class Opgave1 {

    public static void main(String[] args) {
        int number = 2;
        // Her definerer jeg det tal jeg gerne vil gange med

            //Her laver jeg et ForLoop som går fra 1-4.
        for(int i = 1; i <= 4; i++) { //i++ betyder at man plusser i med en hver gang
            // Her udskrives regnestykket plus resulatatet, og det stopper, når i er større end 4
            System.out.println(number + " gange " + i + " = " + (number * i));
        }
    }
}