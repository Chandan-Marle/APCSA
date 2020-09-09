import java.util.Scanner;

public class WeekTemp{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What was Monday's temperature?");
        int mon = scan.nextInt();
        System.out.println("What was Tuesday's temperature?");
        int tue = scan.nextInt();
        System.out.println("What was Wednesday's temperature?");
        int wed = scan.nextInt();
        System.out.println("What was Thursday's temperature?");
        int thu = scan.nextInt();
        System.out.println("What was Friday's temperature?");
        int fri = scan.nextInt();

        System.out.println("Monday:" + mon + "Degrees   Tuesday: " + tue +
        "   Wednesday:" + wed + " Degrees   Thursday:" + thu + " Degrees   Friday:" + fri + " Degrees");

        scan.close();
    }
  }
  