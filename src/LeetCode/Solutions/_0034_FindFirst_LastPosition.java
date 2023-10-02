package LeetCode.Solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class _0034_FindFirst_LastPosition {
    static int[]nums={4,4};
    int target=4;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(nums,4)));
    }


    public static int[] searchRange(int[] nums, int target) {
        int first = firstBound(nums,target,true);
        if (first==-1){
            return new int[]{-1,-1};
        }else return new int[] {first ,  firstBound(nums,target,false)};

    }


    public static int firstBound(int[] nums, int target,boolean isFirst ){
        int left=0, right=nums.length-1;
        while (left<=right){
            int mid= left+(right-left)/2;
            if(nums[mid]==target){
                if(isFirst){
                   int first=mid;
                    if(mid==left || nums[mid-1]!=target){
                       return mid;
                    }
                    else right =mid-1;
                }
                else {
                    int last=mid;
                    if(mid==right || nums[mid+1]!=target){
                        return mid;
                    }
                    else left=mid+1;
                }

            }
            else if (nums[mid]<target){
                left=mid+1;
            }
            else right=mid-1;
        }


        return -1;
    }


















    //copied code
  /*  public void searchRange() {

        int firstOccurrence = this.findBound(nums, target, true);

        if (firstOccurrence == -1) {
            System.out.println(Arrays.toString(new int[]{-1, -1}));
        }

        int lastOccurrence = this.findBound(nums, target, false);

        System.out.println(Arrays.toString(new int[]{firstOccurrence, lastOccurrence}));
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int N = nums.length;
        int begin = 0, end = N - 1;

        while (begin <= end) {

            int mid = (begin + end) / 2;

            if (nums[mid] == target) {

                if (isFirst) {

                    // This means we found our lower bound.
                    if (mid == begin || nums[mid - 1] != target) {
                        return mid;
                    }

                    // Search on the left side for the bound.
                    end = mid - 1;

                } else {

                    // This means we found our upper bound.
                    if (mid == end || nums[mid + 1] != target) {
                        return mid;
                    }

                    // Search on the right side for the bound.
                    begin = mid + 1;
                }

            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;
    }*/
}
