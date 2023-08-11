package LeetCode.Solutions;
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other,append the additional letters onto the end of the merged string.
Return the merged string.
 */

public class _1768_MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcdef","123456789"));
        }

    public static String mergeAlternately(String word1, String word2){
        StringBuilder merge = new StringBuilder();
        int i=0;
        while(i<word1.length()||i<word2.length()) {
            if(i<word1.length())
                merge.append(word1.charAt(i));
            if(i<word2.length())
                merge.append(word2.charAt(i));
            i++;
        }
        return merge.toString();
    }




}
