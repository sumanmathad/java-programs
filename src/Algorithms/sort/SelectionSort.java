package Algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println(selectionSort(new int[]{2,5,34,6,0,1,-6,9,-2}));
    }

    public static String selectionSort(int[] arr){
        for(int lastUnSortedindex=arr.length-1; lastUnSortedindex>0;lastUnSortedindex--){
            int largest=0;
            for (int i =1;i<=lastUnSortedindex;i++){
                if(arr[largest]<arr[i]){
                    largest=i;
                }
                swap(arr,largest,lastUnSortedindex);
            }
        }

        return Arrays.toString(arr);
    }



    private static void swap(int[] nums, int i, int j) {
        if(i==j){
            return;
        }
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


}
