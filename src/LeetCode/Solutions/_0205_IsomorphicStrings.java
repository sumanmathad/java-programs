package LeetCode.Solutions;

import java.util.HashMap;

/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
public class _0205_IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("papers", "titled"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(!(s.length()==t.length()))
            return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                if (!(map.get(s.charAt(i))==t.charAt(i))){
                    return false;
                }
            }
            else if (map.containsValue(t.charAt(i)))
                return false;

            else map.put(s.charAt(i),t.charAt(i));
        }

        return true;
    }

}
