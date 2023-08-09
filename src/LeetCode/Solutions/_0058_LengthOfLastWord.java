package LeetCode.Solutions;
/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
 */
public class _0058_LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("this  is    a line    of spaces "));

    }

    public static int lengthOfLastWord(String line){
        char[] words = line.trim().toCharArray();
        int count=0;
        for (int i=words.length-1; i>=0;i--){
            if (words[i]==' '){
             return count;
            }
            count++;
        }
        return count;

    }

 /*
  *******Alternate Solution*********
  public int lengthOfLastWord(String s) {
        String words[]= s.split(" ");
       return words[words.length-1].length();
    }
  ********Alternate Solution*********
*/




}
