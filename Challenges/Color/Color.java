import java.util.Random;

public class Color{
    int upperbound = 255;

    Random random = new Random();
    
    public int redCreation(){
        int red = random.nextInt(upperbound);
        return red;
    }

    public int greenCreation(){
        int green = random.nextInt(upperbound);
        return green;
    }

    public int blueCreation(){
        int blue = random.nextInt(upperbound);
        return blue;
    }
}