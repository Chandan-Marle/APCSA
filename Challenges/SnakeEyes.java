import java.util.Random;
import java.util.Scanner;

public class SnakeEyes{

    public static void main(String[] args){
        Random randomGenerator = new Random();
        Scanner scan = new Scanner(System.in);
        int die = 6;
        System.out.println("How many times would you like to run it?");
        int runs = scan.nextInt();


        int d1 = randomGenerator.nextInt(die);
        int d2 = randomGenerator.nextInt(die); 

        
        scan.close();
    }
}
