package LeetCode.Solutions.Problems_101_to_200;
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
import java.util.Arrays;

public class _0189_RotateArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1,2,3,4,5,6,7},3)));
    }
    public static int[] rotate(int[] nums, int k){
        k%= nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
        return nums;
    }
    public static void reverse(int[]nums, int start, int end){
        while( start<end) {
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
