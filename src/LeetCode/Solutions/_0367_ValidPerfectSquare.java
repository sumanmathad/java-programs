package LeetCode.Solutions;
/*
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.
 */
public class _0367_ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));
    }
    public static boolean isPerfectSquare(int num) {
        int left = 0, right = num >> 1;

        if (num == 1)
            return true;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);

            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return false;


    }

    }
