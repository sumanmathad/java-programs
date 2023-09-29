package LeetCode.Solutions;

import java.util.Arrays;

/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
 */
public class _0905_SortArrayParity {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4, 9, 5, 88, 41, 2, 3,})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i < j) {
            while (i < j && ((nums[i] & 1) == 0))
                i++;
            while (i < j && ((nums[j] & 1) == 1))
                j--;
            System.out.println("nums[i]= "+nums[i]+"and nums[j]="+nums[j]);
            nums[i] = (nums[i] ^ nums[j]);
            nums[j] = (nums[i] ^ nums[j]);
            nums[i] = (nums[i] ^ nums[j]);
            System.out.println("nums[i]= "+nums[i]+"and nums[j]="+nums[j]);
        }
        return nums;
    }
}