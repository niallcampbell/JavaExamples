import java.util.HashMap;

public class DuplicateCharacters {

    /**
     * Print the number of times a duplicate character appears in a String. 
     * Use a HashMap to store the all the characters of the String and the number of times each character appears. 
     */
    public static void printNumberOfTimesDuplicateCharsAppear(String word){
        
        char[] chars = word.toCharArray();
        HashMap <Character, Integer> duplicatesMap = new HashMap <Character, Integer>();
        
        for(Character c : chars){
            if(duplicatesMap.containsKey(c)){
                duplicatesMap.put(c, duplicatesMap.get(c) + 1);
            } else {
                duplicatesMap.put(c, 1);
            }
        }
        
        for(HashMap.Entry<Character, Integer> entry : duplicatesMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        
    }

    /**
     * Alternate method.
     * Prints the characters that occur more than once in a given String.
     */
    public static void printDuplicateCharactersInAString(String s){

        System.out.println("String: " + s);
        String duplicateCharacters = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j) 
                    && !duplicateCharacters.contains(Character.toString(s.charAt(j)))
                        && !(s.charAt(i) ==' ')){
                    String c = Character.toString(s.charAt(i));
                    duplicateCharacters = duplicateCharacters.concat(c);
                }
            }
        }
        
        System.out.print("The following are duplicate characters in " + s + ": ");
        for(int i = 0; i < duplicateCharacters.length(); i++){
            System.out.print(duplicateCharacters.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {
        printDuplicateCharactersInAString("Hello World How are you today?");
        System.out.println();
        System.out.println();
        printNumberOfTimesDuplicateCharsAppear("Java");
    }
}
