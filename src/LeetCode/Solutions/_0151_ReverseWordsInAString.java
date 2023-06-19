package LeetCode.Solutions;
/*
Given an input string s, reverse the order of the words.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words.
Do not include any extra spaces.
Input: s = "a good   example   "
Output: "example good a"
 */
public class _0151_ReverseWordsInAString {
    public static void main(String[] args) {

        String s = "a good   example   ";
        System.out.println("The sentence is : "+s);
        String[] words = s.trim().split("\\s+");
        String temp="";
        for(int i=words.length-1;i>0;i--){
            temp+=words[i]+" ";
        }
        temp+=words[0];
        System.out.println("Answer is : "+temp);
    }



}
