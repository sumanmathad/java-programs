package LinkedinLearning.JavaPractice_Collections;

import java.sql.SQLOutput;
import java.util.*;

//Return the indices of the number that add up to targetSum.
public class findIndicesOfTargetSum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 55 );
        int targetSum = 68;
        System.out.println(getIndices(numbers, targetSum));
    }
    static List<Integer> getIndices(List<Integer> source, int target) {
        Map<Integer, Integer> numbersmap = new HashMap<>();
        for(int i=0;i<source.size();i++){
            numbersmap.put(source.get(i),i);
        }
        System.out.println(numbersmap);
        for(int i=0;i<source.size();i++){
            int diff = target-source.get(i);
            if(numbersmap.containsKey(diff) && numbersmap.get(diff)!=i){
                return Arrays.asList(i, numbersmap.get(diff));
            }
        }
        return Arrays.asList(-1,-1);

        }



}
