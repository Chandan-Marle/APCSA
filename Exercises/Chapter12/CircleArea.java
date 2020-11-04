import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("The radius is: " + radius);
        System.out.println("The area is: " + area);
        scan.close();
    }
}