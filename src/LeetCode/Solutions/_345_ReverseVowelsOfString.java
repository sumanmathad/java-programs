package LeetCode.Solutions;
/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Input: s = "leetcode"
Output: "leotcede"
 */

public class _345_ReverseVowelsOfString {
    public static void main(String[] args) {
    String s ="leetcode";
        System.out.println("The sentence is : "+s);
    StringBuilder vowels=new StringBuilder();
    StringBuilder reverse = new StringBuilder();
        for( char x: s.toCharArray()){
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
            {
                vowels.append(x);
            }
        }
            vowels=vowels.reverse();
        int j=0;

        for(int x=0; x<s.length(); x++){
            char ch = s.charAt(x);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                reverse.append(vowels.charAt(j));
                j++;
            }
            else reverse.append(ch);
        }
        System.out.println("The output is : "+reverse);
    }
}
