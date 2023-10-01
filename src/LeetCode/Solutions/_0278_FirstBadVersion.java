package LeetCode.Solutions;
/*
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which returns whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.

 */
public class _0278_FirstBadVersion {
    static int bad =9;
    public static void main(String[] args) {
        System.out.println(firstBadVersion(20));

    }

        public static int firstBadVersion(int n) {
            int left =1, right=n;

            while(left<right){
                int mid=left + (right-left)/2;
                boolean res= isBadVersion(mid);
                if(res){
                    right=mid;
                }
                else{
                    left=mid+1;
                }
            }
            return left;

        }

        public static boolean isBadVersion(int mid){

            return mid>=bad? true:false;

        }

}
