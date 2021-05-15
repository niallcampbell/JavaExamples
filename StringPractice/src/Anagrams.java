package src;

import java.util.Arrays;

public class Anagrams {
    
    /**
     *  Method that checks if two Strings are anagrams of each other. 
     *  Two strings are anagrams of each other if they contain the same characters but in a different order. 
     */
    public static boolean checkIfAnagram(String s1, String s2){

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if(arr1.length != arr2.length){
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String [] args){
        System.out.println(checkIfAnagram("fired", "fried"));
        System.out.println(checkIfAnagram("hellow", "world"));
    }

}