import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateValue {
    
    /**
     *  Find the duplicate value in a given integer array
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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,6};
        System.out.println(findDuplicateValue(arr));
    }

}
