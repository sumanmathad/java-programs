package LeetCode.Solutions;

import java.util.*;

/*
Given a string s, find the length of the longest substring without repeating characters.
 */
public class _0003_LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("psdfgsdjfhgfgs"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if (s.isEmpty() && s.length()==0 ){
            return 1;
        }
        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();

        int maxsize=0;
        for(char c:s.toCharArray()){
            if(list.contains(c)){
                if(list.size()>maxsize) {
                    maxsize = list.size();
                }
                for(int i=0;i<=list.indexOf(c);i++){
                    list.remove(i);
                }
            }
            list.add(c);

        }


        return maxsize;
    }

}
/*
            if(!set.add(c)){
                if(set.size()>maxsize) {
                    maxsize = set.size();
                }
                set.
            }
            if(c==s.charAt(s.length()-1)&&set.size()>maxsize ){
                maxsize = set.size();

            }
 */