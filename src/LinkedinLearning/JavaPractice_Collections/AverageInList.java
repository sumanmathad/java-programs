package LinkedinLearning.JavaPractice_Collections;

import java.util.Arrays;
import java.util.List;

//Return the average (mean) of the values in the source list
public class AverageInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 5 );
        System.out.println(getAverage(numbers));
    }
    static double getAverage(List<Integer> source) {
        return source.stream().reduce(0,Integer::sum) / (double)source.size();
    }
}
