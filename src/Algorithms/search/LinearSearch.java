package Algorithms.search;

public class LinearSearch {

    public static int linearSearch(int[]numbers,int numToFind){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==numToFind){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        System.out.println(linearSearch(new int[]{1, 67, 87, 2,5 ,6 ,33, 34,11, 90}, 90));
        System.out.println(linearSearch(new int[]{1, 67, 87, 2,5 ,6 ,33, 34,11, 90}, 0));
        System.out.println(linearSearch(new int[]{1, 67, 87, 2,5 ,6 ,33, 34,11, 90}, 1));

    }
}
