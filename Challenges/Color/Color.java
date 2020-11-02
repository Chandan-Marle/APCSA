import java.util.Random;

public class Color{
    int upperbound = 255;

    Random random = new Random();
    
    public int redCreation(){
        int r = random.nextInt(upperbound);
        return r;
    }

    public int greenCreation(){
        int g = random.nextInt(upperbound);
        return g;
    }

    public int blueCreation(){
        int b = random.nextInt(upperbound);
        return b;
    }
}