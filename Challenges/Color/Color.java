import java.util.Random;

public class Color {

    public int red, green, blue;
    // private float percentShader;


    Random random = new Random();
    
    public Color(int red, int green, int blue){
        red = this.red;
        green = this.green;
        blue = this.blue;
    }
    
    public String createColor(){
        red = createSegment();
        green = createSegment();
        blue = createSegment();
        return "["+red+","+green+","+blue+"]";
    }

    private int createSegment(){
        return random.nextInt(255);
    }

    public String colorShade(double shader){
        double r = red;
        double g = green;
        double b = blue;
        r = r*shader;
        if (r>255) {
            r = 255;
        }        
        g = g*shader;
        if (g>255) {
            g = 255;
        }
        b = b*shader;
        if (b>255) {
            b = 255;
        }
        red = (int) r;
        green = (int) g;
        blue = (int) b;
        return "["+red+","+green+","+blue+"]";
    }
 


}