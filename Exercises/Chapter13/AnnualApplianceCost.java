import java.util.Scanner;

public class AnnualApplianceCost{
    public static void main(String[] args) {
        double killowattHour;
        double yearlyUse;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your killowatt-hour cost?");
        killowattHour = scan.nextDouble();
        System.out.println("How many killowatt-hours do you use per year?");
        yearlyUse = scan.nextDouble();
        System.out.println("You spend: "+ yearlyUse*killowattHour + " dollars per year");

    }
}