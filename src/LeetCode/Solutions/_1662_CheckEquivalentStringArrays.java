package LeetCode.Solutions;
/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.
 */
public class _1662_CheckEquivalentStringArrays {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqualwithJoin(new String[]{"abc", "d", "defg"}, new String []{"abcddefg"}));
    }

    public static boolean  arrayStringsAreEqualwithJoin(String[] word1, String[] word2) {
      return String.join("",word1).equals(String.join("",word2));
    }


    public static boolean arrayStringsAreEqualwithBuilder(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String w1: word1) {
            sb1.append(w1);
        }
        for(String w2: word2) {
            sb2.append(w2);
        }

    return sb1.toString().equals(sb2.toString());

    }




}
