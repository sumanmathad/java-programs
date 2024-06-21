package LinkedinLearning.JavaPractice_Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiveOrLessCharacters {
    public static void main(String[] args) {
        String source = "there are both smaller and bigger words here";
        System.out.println(findFiveOrFewer(source));
    }
    static List<String> findFiveOrFewer(String source) {
        return Arrays.stream(source.split(" ")).filter(s->s.length()<=5).collect(Collectors.toList());

    }
}
