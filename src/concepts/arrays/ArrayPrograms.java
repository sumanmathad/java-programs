package concepts.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayPrograms {

    public static void main(String[] args) {

    }

    @Test
    public void largestElement() {
        int[] arr = {3, 0, 4, 22, 8, 14, 0, 22, 4, 13};
        //sort and pick last
        Arrays.sort(arr);
        System.out.println("largest is " + arr[arr.length - 1]);

        int[] arr1 = {3, 0, 4, 22, 8, 14, 0, 22, 4, 13};
        //traverse and check and save the largest
        int large = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (large < arr1[i]) {
                large = arr1[i];
            }
        }
        System.out.println("largest is " + large);
    }


    @Test
    public void secondLargestWithSort(){
        int[] arr = {10, 10,0,10, 10};
        //sort and pick unique second last
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int large =arr[arr.length-1];
        int secondLarge=-1;
        if (arr[arr.length-2]!=large){
            secondLarge=arr[arr.length-2];
        }
        else
            for(int i=arr.length-3;i>=0;i--){
                if(large!=arr[i]){
                    secondLarge=arr[i];
                    break;
                }
            }
        System.out.println("Second large is "+secondLarge);
    }

    @Test
        public void secondLargestWithoutSort(){
        int[] arr = { 12 };
        // two traverse
        int large=arr[0], secondlarge=-1;

        for(int i=1;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondlarge && large!=arr[i]){
                secondlarge=arr[i];
            }
        }
        System.out.println("large is "+large + " and second large is "+secondlarge);

        //one traverse
        int[] arr1 = {3, 0, 4, 22, 8, 14, 0, 22, 4, 13};

        large = arr1[0];
        secondlarge = -1;

        for(int i=1;i<arr1.length;i++){
            if (arr1[i] >large){
                secondlarge=large;
                large = arr1[i];
            }
            else if(arr1[i]>secondlarge && arr1[i]!=large){
                secondlarge=arr1[i];
            }
        }
        System.out.println("large is "+large + " and second large is "+secondlarge);
    }






    //@Test
    //    public void name(){
    //}

}
