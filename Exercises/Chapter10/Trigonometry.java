public class Trigonometry {
    public static void main(String[] args) {
       double rad = 0.5236;
       double sin = Math.sin(rad);
       double cos = Math.cos(rad);

       sin = sin*sin;
       cos = cos*cos;

       double answer = sin + cos;
       System.out.println(answer); 
    }
