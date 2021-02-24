import java.util.Random;
import java.util.ArrayList;

public class Payroll {
    private String name, position;
    private double wage;
    private int id, totalHoursWorked, payPeriodHours;
    private static int highestId;
    Random random = new Random();

    public Payroll(String name, String position, double wage){
        createId();
        name = this.name;
        position = this.position;
        wage = this.wage;
        
    }

    private void createId(){
        id = highestId + 1;
        highestId = id;
    }
}

    