import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like X to be?");
        double x = scan.nextDouble();
        System.out.println("What would you like Y to be?");
        double y = scan.nextDouble();
        double answer = 2.0/((1/x)+(1/y));
        System.out.println("The harmonic mean is "+ answer);
    }
}
