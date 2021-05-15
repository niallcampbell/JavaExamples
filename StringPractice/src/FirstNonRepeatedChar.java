package src;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {
    
    /**
     *  Print the first non-repeated character in a given String. 
     * 
     *  Store the number of times each character occurs in a linked hashmap. 
     *  A linked hashmap maintains the order of the elements inserted into it. 
     * 
     */
    public static void printFirstNonRepeatedChar(String word){

        char[] chars = word.toCharArray();
        LinkedHashMap<Character, Integer> numOccurancesTable = new LinkedHashMap<Character, Integer>();
        boolean found = false;

        for(int i = 0; i < chars.length; i++){
            if(numOccurancesTable.containsKey(chars[i])){
                numOccurancesTable.put(chars[i], numOccurancesTable.get(chars[i]) + 1);
            } else {
                numOccurancesTable.put(chars[i], 1);
            }
        }
        
        for(Entry<Character, Integer> entry : numOccurancesTable.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("The first non repeated character in " + word + " is: " + entry.getKey());
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("There is no non-repeated character in " + word);
        }
        
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Please enter a word");
            String word = scan.nextLine();
            printFirstNonRepeatedChar(word);
        } finally {
            scan.close();
        }

    }

}
