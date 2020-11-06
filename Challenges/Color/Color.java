import java.util.Random;

public class Color {

    private int red, green, blue;

    Random random = new Random();
    
    public Color(){
        randomizeColor();;
    }
    
    public void randomizeColor(){
        red = randomizeSegment();
        green = randomizeSegment();
        blue = randomizeSegment();
    }

    private int randomizeSegment(){
        return random.nextInt(255);
    }

    public void changeShade(double shadeAmp){
        red = shadeChanger(red, shadeAmp);
        green = shadeChanger(green, shadeAmp);
        blue = shadeChanger(blue, shadeAmp);
    }

    private int shadeChanger(int color, double shadeAmp){
        double newColor = color; 
        newColor = newColor*shadeAmp;
        if (newColor>255) {
            newColor = 255;
        }
        return (int) newColor;
    }
    
    public String getColor(){
        return "["+red+","+green+","+blue+"]";
    }

    public String getRed(){
        return "["+red+"]";
    }
    
    public String getGreen(){
        return "["+green+"]";
    }

    public String getBlue(){
        return "["+blue+"]";
    }

    
}