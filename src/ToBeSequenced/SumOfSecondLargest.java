package ToBeSequenced;

public class SumOfSecondLargest {
    /*
    Return the sum of second largest of even placed and odd placed numbers in an array  with initial index 0 assumed to be even
    input = {1,6,8,2,3,4,5,0}
    o/p should be 5 + 4 = 9
     */
    public static void main(String[] args) {
        System.out.println(sumOfSecondLargestEvenOdd(new int[] {1,6,8,2}));
    }

    private static int sumOfSecondLargestEvenOdd(int[] arr) {
       int secondMaxOdd,maxOdd,secondMaxeven,maxEven;

        if (arr[2]>arr[0]){
            secondMaxeven=arr[0];
            maxEven=arr[2];
        }
        else{
            secondMaxeven=arr[2];
            maxEven=arr[0];
        }
        if (arr[3]>arr[1]){
            secondMaxOdd=arr[1];
            maxOdd=arr[3];
        }
        else{
            secondMaxOdd=arr[3];
            maxOdd=arr[1];
        }

        for (int i=4; i< arr.length;i++){


         if(i%2==0){

             if (arr[i]>maxEven){
                 secondMaxeven=maxEven;
                 maxEven=arr[i];
             }
             if (arr[i]>secondMaxeven&& arr[i]<maxEven){
                 secondMaxeven=arr[i];
             }

             System.out.println("max even ="+maxEven );
             System.out.println("second maxeven="+secondMaxeven);

         }
         else {
             if (arr[i]>maxOdd){
                 secondMaxOdd=maxOdd;
                 maxOdd=arr[i];
             }
             if (arr[i]>secondMaxOdd && arr[i]<maxOdd){
                 secondMaxOdd=arr[i];
             }
         }
        }
        System.out.println(secondMaxeven+"+"+secondMaxOdd);
        return secondMaxeven+secondMaxOdd;

    }

}
