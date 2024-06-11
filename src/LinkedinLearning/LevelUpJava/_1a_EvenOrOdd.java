package LinkedinLearning.LevelUpJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class _1a_EvenOrOdd {

    public static void main(String[] args) {
        assertFalse(isEven_DivideBy2(5));
        assertTrue(isEven_DivideBy2(0));
        assertFalse(isEvenbyXOR(5));
        assertTrue(isEvenbyXOR(0));
        assertTrue(isEvenbyXOR(18));
        assertFalse(isEvenbyAND(5));
        assertTrue(isEvenbyAND(0));
        assertTrue(isEvenbyAND(18));
        assertFalse(isEvenbyOR(5));
        assertTrue(isEvenbyOR(0));
        assertTrue(isEvenbyOR(18));
        assertFalse(isEvenbyBitsShift(5));
        assertTrue(isEvenbyBitsShift(0));
        assertTrue(isEvenbyBitsShift(18));
        System.out.println("Success");
    }

    @Test
    public static boolean isEven_DivideBy2(int num){
        return num%2==0;
    }

    @Test
    public static boolean isEvenbyXOR(int num){
        return (num^1)==num+1 ;
    }

    @Test
    public static boolean isEvenbyAND(int num){
        return (num&1)==0;
    }

    @Test
    public static boolean isEvenbyOR(int num){
        return (num|1)>num;
    }

    @Test
    public static boolean isEvenbyBitsShift(int num){
        return num == ((num>>1)<<1);
    }



}

