package LeetCode.Solutions.Problems_001_to_100;
/*
Given two binary strings a and b, return their sum as a binary string.
 */
public class _0067_AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1" ;

        System.out.println(addBinaryBuiltIn(a,b));
        System.out.println(bitAddition(a,b));
    }

    //using built in methods
    private static String addBinaryBuiltIn(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }

    //using bit addition
    private static String bitAddition(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int sum=0,carry=0;
        StringBuilder sb= new StringBuilder();

        while (i>=0||j>=0){
            sum=carry;
            if(i>=0) sum+=a.charAt(i)-'0';
            if(j>=0) sum+=b.charAt(j)-'0';
            sb.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        }
        if(carry!=0)
            sb.append(carry);
        return sb.reverse().toString();
    }







}
