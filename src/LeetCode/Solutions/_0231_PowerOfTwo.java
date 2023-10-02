package LeetCode.Solutions;

public class _0231_PowerOfTwo {
    /*
    Given an integer n, return true if it is a power of two. Otherwise, return false.
    An integer n is a power of two, if there exists an integer x such that n == 2x.
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.println(powerOf2BruteForce(n));
    }

    /******************  Brute Force  ******************************/
    private static boolean powerOf2BruteForce(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;

    }
    /******************   ******************************/

}
