import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateValue {
    
    /**
     *  Find the single duplicate value in a given integer array
     */

    public static int findDuplicateValue(int[] arr){

        HashMap<Integer, Integer> occurances = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++){
            if(occurances.containsKey(arr[i])){
                occurances.put(arr[i], occurances.get(arr[i]) + 1);
            } else {
                occurances.put(arr[i], 1);
            }
        }

        for(Entry<Integer, Integer> entry : occurances.entrySet()){
            if(entry.getValue() > 1){
                return entry.getKey();
            }
        }

        return 0;
    }

    /**
     *  Remove the duplicate values from an array. 
     */
    public static int[] removeDuplicateValues(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int[] result = new int[map.size()];

        int i = 0;
        for(Entry<Integer, Integer> entry : map.entrySet()){
            result[i] = entry.getKey();
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,6};
        System.out.println("Single duplicate value: " + findDuplicateValue(arr));

        System.out.println();

        int[] arr2 = {1,2,3,1,2,3,4,5,6,5};
        System.out.println("Remove duplicates: ");
        int[] arr2Result = removeDuplicateValues(arr2);
        for(int i = 0; i < arr2Result.length; i++){
            System.out.print(arr2Result[i] + " ");
        }
        System.out.println();
    }

}
