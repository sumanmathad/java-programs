package concepts.binarysearch;

public class LowerUpperBounds {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        System.out.println(lowerBound(arr,9));

    }
    public static int lowerBound(int[] arr, int key){
        int lbound = arr.length;
        int low=0,high=arr.length-1;


        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=key){
                lbound=mid;
                high=mid-1;
            }
            else low=mid+1;
        }

        return lbound;
    }



}
