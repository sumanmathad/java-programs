package LeetCode.Solutions;

import java.util.HashMap;

/*
Given two strings ransomNote and magazine,
return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
 */
public class _0383_RansomNote {


    public static void main(String[] args) {
        System.out.println(checkRansomNote("aabcd","aacedb"));
    }

    public static boolean checkRansomNote(String ransomNote, String magazine) {
     HashMap<Character,Integer> magazineMap = new HashMap();
        char[] magazineChar=magazine.toCharArray();

        for (char c:magazineChar) {
            if(magazineMap.containsKey(c))
            magazineMap.put(c,magazineMap.get(c)+1);
            else
                magazineMap.put(c,1);
        }


        char[] ransomCharArray = ransomNote.toCharArray();
        for (char c:ransomCharArray){
            if(magazineMap.containsKey(c)&&magazineMap.get(c)>0){
                magazineMap.put(c,magazineMap.get(c)-1);
            }
            else
                return false;
        }
        return true;
    }
}
