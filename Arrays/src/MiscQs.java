import java.util.Arrays;

public class MiscQs {
    
    /**
     *  Find the largest number in an array. 
     */

    public static int largestValue(int[] arr){

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    /**
     *  Find the smallest value in an array. 
     */

    public static int smallestValue(int[] arr){

        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        return smallest;
    }


    public static void main(String[] args) {
        int[] arr = {23, -45, 78, 92, 12, 45};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Smallest Value: " + smallestValue(arr));
        System.out.println("Largest Value: " + largestValue(arr));
    }

}
