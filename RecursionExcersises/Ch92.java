public class Ch92 {

    public static void main(String[] args) {

        System.out.print("Rabit is ");
        System.out.println(rabit(7));

        System.out.print("FibR is ");
        System.out.println(fibR(6));
        

    }

    // public static boolean prime(int n) {
    //     n = primeRecusive(n, (n-1));
    //     if (n == 1) {
    //         return true;
    //     } 
    //     if (n == -1) {
    //         return false;
    //     }
    //     return true
    // }
    // public static int primeRecusive(int n, int d) {
    //     if (d == 1) {
    //         return 1;
    //     }
    //     if (n % d == 0) {
    //         return -1;
    //     }
    //     // System.out.println("D: " + d + " N: " + n);
    //     return primeRecusive(n, (d-1))
    // }

    // Prime not working
    //Must ask Padjen

    public static int rabit(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0){ 
            return 0;
        }
        return rabit(n-1) + rabit(n-2) - rabit(n-4);

    }

    public static int fibR(int n) {
        if (n == 0 || n == 1) return 1;
        
        int total = fibR(n-1) + fibR(n-2);
        if (total > 10) total = total % 10;
        return total; 
    }
}