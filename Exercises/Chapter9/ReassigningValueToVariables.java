
public class ReassigningValueToVariables {
    public static void main(String[] args) {
        double x = 4;
        double value = 3.0*x*x - 8.0*x + 4.0;
        System.out.println(value);
        x = 0.1;
        value = 3.0*x*x - 8.0*x + 4.0;
        System.out.println(value);
        x = 0.0;
        value = 3.0*x*x - 8.0*x + 4.0;
        System.out.println(value);
  }
}
