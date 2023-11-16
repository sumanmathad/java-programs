package LeetCode.Solutions.Problems_001_to_100;
/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.
 */
public class _0069_SqrtOfX {
    public static void main(String[] args) {
        int x =48;
        System.out.println(mySqrt(x));
        System.out.println(mySqrtBuiltin(x));
    }

    /******************  Built in  ******************************/
    public static int mySqrtBuiltin(int x) {
        return (int)Math.sqrt(x);
    }

    /******************  Binary Search  ******************************/
    public static int mySqrt(int x) {
        if(x<2){
            return x;
        }
        else{
            int i=2;
            int j=x/2;
            while(i<=j){
                int mid = (i+j)/2;
                long midsqr=(long)mid*mid;
                if(x==midsqr){
                    return mid;
                } else if(midsqr<x){
                    i=mid+1;
                }else j= mid-1;
            }
            return j;

        }

    }
}
