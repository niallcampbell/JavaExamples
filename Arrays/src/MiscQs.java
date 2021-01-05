import java.util.Arrays;
import java.util.HashSet;

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

    /**
     *  Find all the pairs in an integer array whose sum is equal to a given number? 
     *  Complexity of this solution is O(n^2). 
     * @param arr
     * @param N
     */
    public static void sumOfPairs(int [] arr, int N){

        System.out.println("Array to check: " + Arrays.toString(arr));
        System.out.println("Number to check: " + N);
        System.out.println("Numbers that add up to " + N + ":");

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(i + j == N){
                    System.out.println("Pair: (" + i + ", " + j + ")" );
                }
            }
        }

    }

    /**
     *  Alternate method to above using HashSet. 
     *  Complexity is O(n). 
     * @param arr
     * @param N
     */
    public static void sumOfPairsAlt(int[] arr, int N){

        System.out.println("Array to check: " + Arrays.toString(arr));
        System.out.println("Number to check: " + N);
        System.out.println("Numbers that add up to " + N + ":");

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++){

            int target = N - arr[i];

            if(set.contains(target)){
                System.out.println("Pair: (" + arr[i] + ", " + target + ")");
            } else{
                set.add(arr[i]);
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {23, -45, 78, 92, 12, 45};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Smallest Value: " + smallestValue(arr));
        System.out.println("Largest Value: " + largestValue(arr));

        System.out.println();
        System.out.println("Sum of Pairs");
        System.out.println();

        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        sumOfPairs(arr2, 9);
        System.out.println();
        sumOfPairsAlt(arr2, 9);
    }

}