import java.util.HashMap;
import java.util.Scanner;

public class OccuranceOfChar {
    

    /**
     *  Count the occurance of a given character in a String. 
     */

     public static int countOccurance(char c, String word){

        char[] arr = word.toCharArray();

        HashMap<Character, Integer> occurancesMap = new HashMap<Character, Integer>();

        for(int i = 0; i < arr.length; i++){
            if(occurancesMap.containsKey(arr[i])){
                occurancesMap.put(arr[i], occurancesMap.get(arr[i]) + 1);
            } else {
                occurancesMap.put(arr[i], 1);
            }
        }

        return occurancesMap.get(c) != null ? occurancesMap.get(c) : 0;

     }

     public static void main(String[] args) {
        System.out.println(countOccurance('l', "Niall")); 
        System.out.println(countOccurance('x', "Niall"));
     }

}
