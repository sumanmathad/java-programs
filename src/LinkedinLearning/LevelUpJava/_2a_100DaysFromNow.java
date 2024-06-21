package LinkedinLearning.LevelUpJava;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class _2a_100DaysFromNow {
    public static LocalDate return100daysfromnow(LocalDate today){
        Period hundred = Period.ofDays(100);
        return today.plus(hundred);

    }

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2020, 1, 1);
        assertEquals(LocalDate.of(2020, 4, 10),return100daysfromnow(d1));

        LocalDate d2 = LocalDate.of(2020, 11, 6);
        assertEquals(LocalDate.of(2021, 2, 14),return100daysfromnow(d2));

        LocalDate d3 = LocalDate.of(2022, 11, 8);
        assertEquals(LocalDate.of(2023, 2, 16),return100daysfromnow(d3));

    }




}
