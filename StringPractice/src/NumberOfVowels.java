package src;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumberOfVowels {
    
    /**
     *  Count and print the number of vowels in a String. 
     */

     public static void countNumberOfVowels(String word){

        char[] chars = word.toCharArray();

        HashMap <Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < chars.length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        for(Entry<Character, Integer> entry : map.entrySet()){
            switch(entry.getKey()) {
                case 'a':
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                    break;
                case 'e':
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                    break;
                case 'i':
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                    break;
                case 'o':
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                    break;
                case 'u':
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                    break;
            }
        }
     }

     public static void main(String[] args) {
         countNumberOfVowels("Hello Niall How Are You");
     }

}
