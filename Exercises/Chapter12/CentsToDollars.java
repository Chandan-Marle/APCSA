import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cents do you have?");
        int cents = scan.nextInt();
        int dollars = cents/100;
        cents = cents%100;
        System.out.println("You have "+dollars+ " dollars and " +cents+" cents");

    }
}
