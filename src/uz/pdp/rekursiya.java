package uz.pdp;

/**
 * Bobosharipov Shokirjon,Thu 4:50 AM. 10/21/2021
 */
public class rekursiya {

    public static void main(String[] args) {
        System.out.println(fibonachi(50 ));
    }


    private static long fibonachi(long n) {
        if (n > 2) {
            return fibonachi(n - 1) + fibonachi(n - 2);

        } else if (n == 1) return 1;

         return 1;
    }
}
