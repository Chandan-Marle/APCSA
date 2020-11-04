public class DegreesToRadians {
    public static void main(String[] args) {
        double degrees = 30;
        double rad = degrees * Math.PI/180.0;

        double rad = 0.5236;
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);

        sin = sin*sin;
        cos = cos*cos;

        double answer = sin + cos;
        System.out.println(answer); 
        
    }
}
