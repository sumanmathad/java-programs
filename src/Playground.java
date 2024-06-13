import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Playground {


    public static void main(String[] args) {
        int nums[] ={2,1,4,8,9}, target =6;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int compl = target-nums[i];
            if(map.containsKey(compl)){
                System.out.println(Arrays.toString(new int[] {i, map.get(compl)}));
            }
            else map.put(nums[i],i);
        }


    }


}
