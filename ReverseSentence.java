package com.mycompany.javaquestions;

/**
 *
 * Reverse the words in a sentence
 * 
 */
public class ReverseSentence {
    
    public static void reverseSentence(String sentence)
    {
        System.out.println(sentence);
        
        String[] arr = sentence.split(" ");
        
        int i = 0;
        int j = arr.length - 1;
        String temp = "";
        
        while(i < j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        for(int x = 0; x < arr.length; x++)
        {
            System.out.print(arr[x] + " ");
        }
    }
    
    public static void main(String args[])
    {
        String sen = "Hello world today now";
        reverseSentence(sen);
    }
    
}
