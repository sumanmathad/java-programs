package ToBeSequenced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAbsentIntegers {

    public static void main(String[] args) {
        printAbsentIntegers(new int[]{1,2,3,4});
    }

    private static void printAbsentIntegers(int[] arr) {
        List al = Arrays.stream(arr).boxed().toList();
        for(int i=0;i<=10; i++){
            if(!al.contains(i)){
                System.out.print(i+" ");
            }
        }

    }

}
