package LinkedinLearning.JavaPractice_Collections;

//Your answer should be a new list in reverse order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 5 );
        System.out.println(getReversed(numbers));
    }


    static List<Integer> getReversed(List<Integer> source) {

        List<Integer> reversedList = new ArrayList<>(source);
        Collections.reverse(reversedList);
        return reversedList;
    }

}
