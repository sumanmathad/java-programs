package LeetCode.Solutions.Problems_701_to_800;
/*
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
 */
public class _0704_BinarySearch {
    public static void main(String[] args) {
        int target =5;
        int[]nums={1,2,3,4,5,6};
        System.out.println(binarySearch (nums,target));
    }

    public static int binarySearch(int[] nums, int target) {
        int i=0,j=nums.length-1;

        while(i<=j){
            int mid=(i+j)/2;

            if (nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else j=mid-1;
        }
        System.out.println("i="+i); // index in array where you can insert the searching num if you want
        System.out.println("j="+j); //index of a num present in array which is less than the searching num
        return -1;  // is output when searching number is not present
    }
}
