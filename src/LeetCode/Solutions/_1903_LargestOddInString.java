package LeetCode.Solutions;
/*
You are given a string num, representing a large integer.
Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.
 */
public class _1903_LargestOddInString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("354270"));
    }

    public static String largestOddNumber(String num) {
        String large="";
        for(int i=num.length()-1;i>=0;i--){
            if ((num.charAt(i)-'0')%2==0)
                continue;
            return num.substring(0,i+1);
        }
        return large;
    }
}
