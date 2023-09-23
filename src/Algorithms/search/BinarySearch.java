package Algorithms.search;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{2,5,8,10,16,18}, 10));

    }


    public static int binarySearch(int[]numbers,int numToFind){
        int low=0;
        int high=numbers.length-1;
        while(low<=high){
            int middlePos = (low+high)/2;
            if(numbers[middlePos]==numToFind){
                return middlePos;
            }
            else if (numbers[middlePos]>numToFind){
                high=middlePos-1;
            }
            else
                low=middlePos+1;
        }
        return -1;
    }
}
