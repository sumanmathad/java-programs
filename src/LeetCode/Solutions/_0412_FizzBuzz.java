package LeetCode.Solutions;
/*
Given an integer n, return a string array of n size answer (1-indexed) where:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/


import java.util.ArrayList;
import java.util.List;

public class _0412_FizzBuzz {

    public static List<String> fizzBuzzString(int n){
        List<String> ans = new ArrayList<>();

        for(int i=1;i<=n;i++) {
            String temp="";
            if (i % 3 == 0) {
                temp+="Fizz";
            }
            if (i % 5 == 0) {
                temp+="Buzz";
            }
            if (temp.length()==0){
                temp=Integer.toString(i);
            }
            ans.add(temp);
        }
        return ans;
    }



    public static void main(String[] args) {
        System.out.println(fizzBuzzString(15));

    }
}
