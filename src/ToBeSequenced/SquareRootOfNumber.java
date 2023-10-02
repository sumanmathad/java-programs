package ToBeSequenced;
/*
Return the Square root of a number or the maximium integer lesser to it.
 */
public class SquareRootOfNumber {
    public static void main(String[] args) {
        int n = 50;

        System.out.println(squareRootBinarySearch(n));
    }
    /******************  Brute Force  ******************************/
    public static int squareRootBruteForce(int n) {
        int root = 0;
        for (int i = 0; i <= n; i++) {
            if ((i * i) <= n) {
                root = i;
            } else break;
        }
        return root;
    }

    /****************** Binary Search   ******************************/
    public static int squareRootBinarySearch(int n) {
        int left=1, right=n;
        while(left<=right){
            int mid =(left+right)/2;
            if(mid*mid==n){
                return mid;
            }
            else if (mid*mid<n){
                left=mid+1;
            }
            else right=mid-1;
        }
        return right;

    }
}
