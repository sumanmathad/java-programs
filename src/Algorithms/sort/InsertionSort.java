package Algorithms.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(InsertionSort(new int[]{-56,-2,2,5,34,6,0,1,-6,9,-2,75}));
        System.out.println(InsertionSort(new int[]{8, 3, 5, 1, 4, 2}));
    }

    public static String InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=current;


        }

        return Arrays.toString(arr);

    }

}
//