package LeetCode.Solutions.Problems_101_to_200;

import java.util.Arrays;
/*
Given a character array s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by a single space.
Your code must solve the problem in-place, i.e. without allocating extra space.
 */
public class _0186_ReverseWordsInString2 {

    public static void main(String[] args) {
        char[] s = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
       reverseWords(s);

    }

    public static void reverseWords(char[] s) {
        int left=0; int right=s.length-1;
        swap(left,right,s);

        int lastSpace=-1;
        for(int idx=0; idx<s.length;idx++){
            if(s[idx]==' ' || idx==s.length-1){

                if(idx==s.length-1){
                    swap(lastSpace+1,idx,s);
                }
                else swap(lastSpace+1,idx-1,s);

            }
        }
        System.out.println(Arrays.toString(s));
    }
    public static void swap(int left, int right, char[]s){
        while(left<right){
            char temp= s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

    }
}
