import java.util.Scanner;
import java.text.DecimalFormat;


public class RuleSeventyTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat("0.0"); 
        System.out.println("What is the interest rate on your deposit?");
        double r = scan.nextDouble();
        double v = 72.0/r;
        System.out.println("It will take you "+numform.format(v)+ " years to double your money!");
    }
}
