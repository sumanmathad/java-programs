package LeetCode.Solutions.Problems_500_to_600;

import java.util.Arrays;

/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */
public class _0557_ReverseWordsInString3 {
    public static void main(String[] args) {
        String s ="Lets solve here";
        System.out.println(reverseWords(s));

    }
    /******************  Solution with String Builder Reverse Function  **************************/
    public static String reverseWordsSBReverse(String s) {
        String[] wordsArr = s.split(" ");

        StringBuilder ans=new StringBuilder("");
        for( int i=0;i< wordsArr.length;i++){
            StringBuilder sb= new StringBuilder(wordsArr[i]);
            wordsArr[i]=sb.reverse().toString();
            ans=ans.append(wordsArr[i]);
            if(i!=wordsArr.length-1){
                ans.append(" ");
            }
        }

        return ans.toString();
        }
    /****************** Traverse and Reverse each character  **************************/
    public static String reverseWords(String s) {
       StringBuilder ans= new StringBuilder();
       int previousSpaceIndex=-1;
       for(int strIndex=0;strIndex<s.length();strIndex++){
           if((s.charAt(strIndex)==' ') || strIndex==s.length()-1){
               int reverseStrIndex= strIndex==s.length()-1?strIndex:strIndex-1;
               for(;reverseStrIndex>previousSpaceIndex;reverseStrIndex-- ){
                   ans=ans.append(s.charAt(reverseStrIndex));
               }
               if(strIndex!=s.length()-1){
                   ans.append(" ");
               }
               previousSpaceIndex=strIndex;
           }
       }
       return ans.toString();
    }
    }

