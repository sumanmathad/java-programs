package LeetCode.Solutions;
/*
You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.
 */

import java.util.Stack;

public class _2390_RemoveStarsFromString {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
    public static String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){

            if(c=='*'){
                stack.pop();
            }
            else
                stack.push(c);
        }
        if(stack.isEmpty())
        {
            return "";
        }
        StringBuilder str=new StringBuilder();
        for(char c:stack){
            str.append(c);
        }
        return str.toString();


    }
}
