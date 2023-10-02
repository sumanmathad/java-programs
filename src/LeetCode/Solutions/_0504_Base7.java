package LeetCode.Solutions;
/*
Given an integer num, return a string of its base 7 representation.
 */
public class _0504_Base7 {
    public static void main(String[] args) {
        int n =70;

        System.out.println(f(n));
    }


    public static String f(int num){
        if(num==0){
            return "0";
        }
        int value = num<0?-num:num;
        StringBuilder ans =new StringBuilder();
        while(value>0){
            ans.append(value%7);
            value/=7;
        }
        return num<0? ans.append("-").reverse().toString():ans.reverse().toString();

    }



}
