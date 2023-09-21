package Algorithms.sort;

import java.util.Arrays;

public class BubbleSort {
    public static String bubbleSort(int[] nums){
        for(int lastUnsortedindex= nums.length-1;lastUnsortedindex>=0;lastUnsortedindex--){
            for(int i=0;i<lastUnsortedindex;i++){

                if(nums[i]>nums[i+1]){
                    swap(nums,i,i+1);
                }
            }

        }
        return Arrays.toString(nums);
    }

    private static void swap(int[] nums, int i, int j) {
        if(i==j){
            return;
        }
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void main(String[] args) {

        System.out.println(bubbleSort(new int[]{2,5,34,6,0,1,-6,9}));
    }

}
