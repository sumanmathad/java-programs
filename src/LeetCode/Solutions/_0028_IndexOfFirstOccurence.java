package LeetCode.Solutions;
/*
Given two strings needle and haystack,
return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.


 */
public class _0028_IndexOfFirstOccurence {
    public static void main(String[] args) {
        System.out.println(firstOccurence("sa4debutsad","sad"));
    }
    public static int firstOccurence(String haystack, String needle){

        char[]haystackChar = haystack.toCharArray();
        for (int c=0;c<=haystackChar.length-needle.length();c++){
            if(needle.charAt(0)==haystackChar[c])
            {
                if(haystack.substring(c, c+needle.length()).equals(needle)){
                    return c;
                }

            }
        }

        return -1;

    }

}
