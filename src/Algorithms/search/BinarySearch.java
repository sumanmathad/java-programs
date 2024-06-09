package Algorithms.search;

public class BinarySearch {

    public static void main(String[] args) {
        //System.out.println(binarySearch(new int[]{2,5,8,10,16,18,19,24,27}, 100));
        System.out.println(recursiveBinarySearch(new int[]{3, 4, 6, 7, 9, 12, 16, 17}, 4));
    }

    public static int iterativeBinarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return -1;

    }

    public static int recursiveBinarySearch(int[] arr, int target){
            int low = 0;
            int high = arr.length-1;
        return recurSearch(arr,low,high,target);
    }

    public static int recurSearch(int[] arr, int low, int high, int target){
        if(low>high){
            return -1;
        }
        int mid=low + ((high-low)/2);

            if (arr[mid]==target){
                return mid;
            }
            else if
            (arr[mid]<target){
                low=mid+1;
            }
            else
                high=mid-1;
            return recurSearch(arr,low,high,target);


    }


}



