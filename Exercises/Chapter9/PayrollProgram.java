public class PayrollProgram
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked;
    hoursWorked = 40;    
    double payRate, taxRate;
    payRate = 10;
    taxRate = .10;
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}

// Code does not work when variables are not declared hower it does work when they are not initialized 