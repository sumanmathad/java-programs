package LeetCode.Solutions;
/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
 */
public class _0008_StringToInteger_atoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("  - 72345+72345=0 "));
    }

    public static int myAtoi(String s) {
        s=s.trim();
        if (s.isEmpty())
            return 0;
        long ans=0;
        int sign = s.charAt(0)=='-'?-1:1;
        if(s.charAt(0)=='-'||s.charAt(0)=='+')
            s=s.substring(1);
        for(final char c : s.toCharArray()){
            if(!Character.isDigit(c)){
                break;
            }
            ans =ans*10+(c-'0');
            if(sign*ans<=Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if(sign*ans>=Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }
        return sign*(int)ans;

    }
}
