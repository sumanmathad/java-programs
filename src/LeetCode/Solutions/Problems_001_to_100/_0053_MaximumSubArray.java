package LeetCode.Solutions.Problems_001_to_100;

/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */
public class _0053_MaximumSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {}));

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }
}
