package LeetCode.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0268_MissingNumber {
    /*
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
     */
    public static void main(String[] args) {
        System.out.println( missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println( missingNumberMathLogic(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    private static int missingNumber(int[] ints) {
        List<Integer> intlist = Arrays.stream(ints).boxed().toList();
        for(int i=0; i<=ints.length;i++){
            if(!intlist.contains(i)){
               return i;
            }
        }
        return 0;
    }
    private static int missingNumberMathLogic(int[] ints) {
      int totalsum =(ints.length*(ints.length+1))/2;
        //sum of N numbers = n(n+1)/2
      for(int i=0; i< ints.length;i++){
          totalsum-=ints[i];
      }
      return totalsum;

    }
}
