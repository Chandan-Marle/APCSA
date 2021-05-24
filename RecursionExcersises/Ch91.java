public class Ch91 {

    public static void main(String[] args) {

        System.out.println("Triangle is");
        System.out.println(triangle(-8));
        System.out.println("Square is ");
        System.out.println(square(3));
        System.out.println("Log is ");
        System.out.println(log(3));
        System.out.println("Power is ");
        System.out.println(pow(7));

    }

    public static int triangle(int N) {

        if (N == 1 || N < 0) {
            return 1;
        } else {
            return N + triangle( N-1 );
        }

    }

    public static int square(int n) {

        if (n == 1) return 1;
        return square(n-1) + (2 * n) - 1;

    }

    public static int log(int n) {

        if (n == 1) return 0;

        return 1 + log(n/2);

    }

    public static int pow(int n) {

        if (n == 0) return 1;

        return 2 * pow(n - 1);
        
    }
}