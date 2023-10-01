package LeetCode.Solutions;

import java.util.Arrays;

public class _1480_RunningSumOf1DArray {
    public static void main(String[] args) {
       // System.out.println(Arrays.toString(runningSum(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(runningSumReturnSameArray(new int[] {1,2,3,4})));

    }

    /******************  Using Additional memory space(Array)  ******************************/
    public static int[] runningSum(int[] nums) {
        int[] sum= new int[nums.length];

        sum[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            sum[i]= nums[i]+sum[i-1];
        }
        return sum;
    }
    /************************** End ********************************/
    public static int[] runningSumReturnSameArray(int[] nums) {
        for(int i=1; i< nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }


}
