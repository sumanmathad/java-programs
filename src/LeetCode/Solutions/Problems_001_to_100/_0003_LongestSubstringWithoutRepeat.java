package LeetCode.Solutions.Problems_001_to_100;

/*
Given a string s, find the length of the longest substring without repeating characters.
 */
public class _0003_LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("sadasdsd"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxsize=0;
        for (int i=0;i<s.length();i++){
            StringBuilder currentSubString = new StringBuilder();
            for(int j=i;j<s.length();j++){
                if(currentSubString.indexOf(String.valueOf(s.charAt(j)))!=-1){
                    break;
                }
                currentSubString.append(s.charAt(j));
                maxsize =Math.max(maxsize,currentSubString.length());
            }

        }
        return maxsize;
    }
}
