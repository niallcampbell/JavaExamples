package com.mycompany.javaquestions;

public class ReverseArray {
    
    public static int[] reverseArray(int[] arr)
    {
        int i = 0;
        int l = arr.length - 1;
        int temp = 0;
        
        while(i < l)
        {
            temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            i++;
            l--;
        }
        
        return arr;
    }
    
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5};
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " "); 
        }
        
        System.out.println();
        
        int[] rev = reverseArray(arr);
        
        for(int i = 0; i < rev.length; i++)
        {
            System.out.print(rev[i] + " "); 
        }
    }
    
}
