package Function;

public class CalculateTip {

    public static void calculatePrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double total = listedPrice + tip + tax;
        System.out.println("Your total meal price is: " + total);

    }

    public static void main(String[] args) {
        calculatePrice(100, 2.0, 3.0);

    }

}
