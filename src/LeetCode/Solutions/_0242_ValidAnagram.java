package LeetCode.Solutions;

import java.util.HashMap;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class _0242_ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));

    }
    public static boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }

        for (char c:t.toCharArray()) {
            if (!map.containsKey(c)){
                return false;
            }
            else map.put(c,map.get(c)-1);
        }
        for (char c:map.keySet())
        {
            if(!(map.get(c)==0))
                return false;
        }
        return true;
    }

}
