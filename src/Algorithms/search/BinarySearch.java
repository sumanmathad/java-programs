package Algorithms.search;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{2,5,8,10,16,18,19,24,27}, 100));

    }


    public static int binarySearch(int[]numbers,int numToFind){
        int i=0;
        int j=numbers.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(numbers[mid]==numToFind){
                return mid;
            }
            else if (numbers[mid]<numToFind){
                i=mid+1;
            }
            else
                j=mid-1;
        }
        System.out.println("i="+i); // index in array where you can insert the searching num if you want
        System.out.println("j="+j); //index of a num present in array which is less than the searching num
        return -1;  // is output when searching number is not present
    }
}
