import java.util.Scanner;

public class BrickDistance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many seconds would you like the brick to travel for?");
        double time = scan.nextDouble();
        double distance = .5*32.174*time*time;
        System.out.println("The brick travels " +distance+ " feet in " +time+ " seconds");
    }
}
