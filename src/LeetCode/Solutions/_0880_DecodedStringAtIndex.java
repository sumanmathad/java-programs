package LeetCode.Solutions;
/*
You are given an encoded string s.
To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:
If the character read is a letter, that letter is written onto the tape.
If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.
Given an integer k, return the kth letter (1-indexed) in the decoded string.


 */


public class _0880_DecodedStringAtIndex {
    public static void main(String[] args) {
        System.out.println(decodeAtIndex("a2345678999999999999999", 1));
    }

    private static String decodeAtIndex(String s, int k) {

        return"";
    }


    /****************************** MemoryExceeded  *******************************
     public static String decodeAtIndex(String s, int k) {

        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if(str.length()>k){
                break;
            }
            if (c < 97) {
                String temp=str.toString();
                for (int i = 50; i <= (int) c; i++) {

                    str.append(temp);

                }
                continue;
            }
            else
            str = str.append(c);

        }

        return Character.toString(str.charAt(k-1));
    }
    //****************************** End  *******************************/




}