import java.util.Scanner;

public class DiscountPrices{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What was is your purchase price?");
        double price = scan.nextDouble();

        if (price > 10) {
            price = price*.9;
        }
    }
}