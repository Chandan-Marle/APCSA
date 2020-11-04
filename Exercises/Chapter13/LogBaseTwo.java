import java.util.Scanner;

public class LogBaseTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like X to be in the equation, y = Log(base2)X ?");
        double x = scan.nextDouble();
        double answer = Math.log(x)/Math.log(2.0);
        System.out.println("y = " + answer);
    }
}
