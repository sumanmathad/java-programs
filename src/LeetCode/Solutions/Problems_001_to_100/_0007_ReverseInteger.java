package LeetCode.Solutions.Problems_001_to_100;

import java.time.LocalDate;

public class _0007_ReverseInteger {
/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

   public static int reverse(int x){
       int rev=0;
       while(x!=0){
           int pop= x % 10;
           x/=10;
           if ((rev>Integer.MAX_VALUE/10)||(rev==Integer.MAX_VALUE&&pop>7))
               return 0;
           if ((rev<Integer.MIN_VALUE/10)||(rev==Integer.MIN_VALUE && pop<-8))
               return 0;
           rev=(rev*10)+pop;
       }
       return rev;
   }


    public static void main(String[] args) {
        System.out.println(reverse(89023449));
        System.out.println(reverse(-456));
    }
}
