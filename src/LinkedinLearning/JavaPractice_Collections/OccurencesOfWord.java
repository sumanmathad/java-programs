package LinkedinLearning.JavaPractice_Collections;

import java.util.Arrays;

//Find the number of times the word appears in the source String.
public class OccurencesOfWord {
    public static void main(String[] args) {
        String source = "Here is an example. Right here.";
        String word = "here";
        System.out.println("Number of Occurrences are : "+getOccurrences(source, word));

    }

    static int getOccurrences(String source,String word){
        String cleanedString = source.replace(".","");          // can also use source.replaceAll("\\.","");
        return (int) Arrays.stream(cleanedString.split(" ")).filter(s->s.equalsIgnoreCase(word)).count();
    }
}
