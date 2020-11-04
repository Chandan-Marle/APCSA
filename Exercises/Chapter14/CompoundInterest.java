import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat("0.00"); 
        System.out.println("What is your inital deposit?");
        double d = scan.nextDouble();
        System.out.println("How many times per year is interest calculated?");
        double n = scan.nextDouble();
        System.out.println("What is its interest rate?");
        double r = scan.nextDouble();
        System.out.println("What many years will you be leaving your deposit?");
        double t = scan.nextDouble();
        double v = d* Math.pow((1+r/n),(n*t));
        System.out.println("$"+numform.format(v));
    }
}