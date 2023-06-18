package LeetCode.Solutions;

import java.util.Arrays;

/*
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place and do not return anything.
Ex :
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
*/
public class _1089_Duplicate_Zeros {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        System.out.println("Input is : "+Arrays.toString(arr));

    int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            temp[i] = arr[i];


        for (int i=0,j =0; i<arr.length;i++,j++) {
            if (temp[j]==0){
                arr[i]=0;
                if(i+1< arr.length){
                    arr[i+1]=0;}
                    i++;

        }
            else arr[i]=temp[j];
    }

        System.out.println("Output is : "+Arrays.toString(arr));

    }
}
