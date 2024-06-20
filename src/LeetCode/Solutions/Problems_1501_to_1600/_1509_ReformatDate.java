package LeetCode.Solutions.Problems_1501_to_1600;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;
import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.*;
public class _1509_ReformatDate {

    public static void main(String[] args) {
        assertEquals("1933-06-06",reformatDate("6th Jun 1933"));
    }

    public static String reformatDate(String date){
        String[] arr = date.split("\\s");
        String day = arr[0].substring(0,arr[0].indexOf('t'));
        day = day.length()<2? "0"+day : day;
        HashMap<String,Integer> map = new HashMap<>(Map.ofEntries(entry("Jan",1), entry("Feb", 2),entry("Mar", 3),entry("Apr", 4),
                entry("May",5), entry("Jun",6), entry("Jul",7),entry( "Aug",8), entry("Sep",9), entry("Oct",10), entry("Nov",11), entry("Dec",12)));
        LocalDate formattedDate = LocalDate.of(Integer.parseInt(arr[2]),map.get(arr[1]),parseInt(day));
        return formattedDate.toString();

    }
}
