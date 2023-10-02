package LeetCode.Solutions;
import java.util.HashMap;
import java.util.Map;

/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 */

public class _1859_SortSentence {

    public static void main(String[] args) {

        String sentence="sentence4 a3 is2 This1";
        System.out.println(sortSentence(sentence));
    }

    public static String sortSentence(String s) {
       Map<Integer,String> map=new HashMap<>();

       for(String word:s.split(" ")){
           int wordSize=word.length();
           map.put((int)(word.charAt(wordSize-1)-'0'),word.substring(0,wordSize-1));
       }
        StringBuilder ans= new StringBuilder(map.get(1));
        for(int i=2;i<=map.size();i++){
            ans.append(" "+map.get(i));
        }
        return ans.toString();
    }
}
