package LeetCode.Solutions;

/*
Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 */
public class _0191_NumberOf1Bits {

    public static void main(String[] args) {
        int n = 128;

        System.out.println(hammingWeightOptimal(n));
    }
    /******************  Mask Shift  ******************************/
    public static int hammingWeightMaskShift(int n) {
        int ones = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((mask & n) != 0) {
                ones++;
            }
            mask = mask << 1;
        }
        return ones;
    }

    /******************  Optimal  ******************************/
    public static int hammingWeightOptimal(int n) {
        int ones = 0;
        while (n != 0) {
            ones++;
            n = n & (n - 1);
        }
        return ones;
    }


}
