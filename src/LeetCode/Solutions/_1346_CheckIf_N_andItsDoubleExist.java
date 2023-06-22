package LeetCode.Solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 */
public class _1346_CheckIf_N_andItsDoubleExist {
    public static void main(String[] args) {
        int [] arr= {10,2,5,3};
        boolean value= false;
        System.out.println("Input is : "+ Arrays.toString(arr));
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if (set.contains(i*2)||((set.contains(i/2))&&(i%2==0))){
                value = true;
            }
            set.add(i);

        }
        if (value==true)
            System.out.println("Set contains Number and it's double");
        else
            System.out.println("Doesn't exist");
    }
}
