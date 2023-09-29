package Algorithms.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        //System.out.println("Before Sort : ");
        System.out.println(quickSort(new int[]{3,2,8,1,9,3,0},0,6));
      //  System.out.println("After QuickSort : ");

    }
// choose pivot, partition basedo n pivot, recurse
    public static String quickSort(int[] arr, int lowIndex, int highIndex){

        if(lowIndex>=highIndex){
            return Arrays.toString(arr);
        }
            int pivot=arr[highIndex];
            int leftPointer=lowIndex;
            int rightPointer=highIndex;
            while (leftPointer<rightPointer){

                while(leftPointer<rightPointer && arr[leftPointer]<=pivot){
                    leftPointer++;
                }
                while(leftPointer<rightPointer && arr[rightPointer]>=pivot){
                    rightPointer--;
                }
                swap(arr,leftPointer,rightPointer);

            }
            swap(arr, leftPointer, highIndex);
            quickSort(arr,lowIndex,leftPointer-1);
            quickSort(arr,leftPointer+1,highIndex);
            return Arrays.toString(arr);
        }

    public static void swap(int[]arr, int index1,int index2){
    int temp =arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;
    }



}
