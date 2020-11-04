import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        int change;
        change = 163;
        int dollars = change/100;
        change = change%100;
        int quarters = change/25;
        change = change%25;
        int dimes = change/10;
        change = change%10;
        int nickels = change/5;
        change = change%5;
        int pennies = change;
        System.out.println("Your change consists of" +dollars+ "dollar(s), "+quarters+" quarter(s), \n "+dimes+" dime(s), "+nickels+" nickel(s), and "+pennies+" pennie(s)");

        

    }
}
