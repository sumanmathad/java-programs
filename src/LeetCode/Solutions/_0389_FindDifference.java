package LeetCode.Solutions;

public class _0389_FindDifference {

    public static void main(String[] args) {

        System.out.print(findTheDifference("abcd", "abcde"));
    }


    public static char findTheDifference(String s, String t) {
        int i=0,j=0,sum=0;
        while(i<t.length()){
            sum+=t.charAt(i);
            i++;
        }

        while(j<s.length()){
            sum-=s.charAt(j);
            j++;
        }
        return (char) sum;
    }
}
