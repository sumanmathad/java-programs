package Algorithms.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(InsertionSort(new int[]{56-2,2,5,34,6,0,1,-6,9,-2,75}));
        System.out.println(InsertionSort(new int[]{8, 3, 5, 1, 4, 2}));
    }

    public static String InsertionSort(int[] nums){


        for(int firstUnSortedIndex=1;firstUnSortedIndex< nums.length;firstUnSortedIndex++){
        int temp =nums[firstUnSortedIndex];
        for (int j=firstUnSortedIndex-1;j>=0;j--){
            if(temp<nums[j]){
                nums[j+1]=nums[j];
                nums[j]=temp;
            }
        }

        }

        return Arrays.toString(nums);

    }

}
