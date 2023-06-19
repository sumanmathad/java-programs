package LeetCode.Solutions;
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other,append the additional letters onto the end of the merged string.
Return the merged string.
 */

public class _1768_MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 ="abcd";
        String word2 ="pq";
        System.out.println("Input: "+"\n"+"word1 is:"+word1+"\n"+"word2 is:"+word2);
        int i=0;
        StringBuilder merge = new StringBuilder();
        while(i<word1.length()||i<word2.length()) {
            if(i<word1.length())
                merge.append(word1.charAt(i));
            if(i<word2.length())
                merge.append(word2.charAt(i));

            i++;

        }
        System.out.println(merge.toString());
        //String conversion added redundantly as Leetcode original program expected String and not String builder
    }
}
