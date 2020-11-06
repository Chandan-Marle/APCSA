public class ColorTester {    
    public static void main(String[] args) {
        Color c1 = new Color();
        System.out.println(c1.getColor());
        c1.changeShade(0.5);
        System.out.println(c1.getColor());
        System.out.println(c1.getRed());
        System.out.println(c1.getGreen());
        System.out.println(c1.getBlue());
        c1.changeShade(7.68346);
        System.out.println(c1.getColor());
        c1.randomizeColor();
        System.out.println(c1.getColor());

    }
}
