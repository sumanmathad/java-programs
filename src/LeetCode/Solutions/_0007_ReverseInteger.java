package LeetCode.Solutions;

import java.time.LocalDate;

public class _0007_ReverseInteger {
    public static void main(String[] args) {
        int input=-1989023449;
        System.out.println("The input Integer is:"+input);

        int rev=0;
        while(input!=0){
            int pop = input % 10;
            input /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
            {
                rev = 0;
                break;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
            {
                rev = 0;
                break;
            }
            rev = rev * 10 + pop;
        }
        System.out.println(rev);


    }
}
