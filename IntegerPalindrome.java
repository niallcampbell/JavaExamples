package com.mycompany.javaquestions;

import java.util.Scanner;

/**
 *  Given an integer, check if it is a palindrome
 *  e.g. 1001 is a palindrome, 1234 is not a palindrome
 * 
 * @author niall.campbell@ammeon.com
 */
public class IntegerPalindrome {
    
    //Break up the number and store in another int
    //Compare the two numbers
    public static void checkIfPalindrome()
    {
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        
        System.out.println("Please enter a number: ");
        int n = scan.nextInt();
        
        int reversed = 0;
        int temp = n;
        
        while(temp != 0)
        {
            int a = temp % 10; //get the last digit
            temp = temp / 10;
            reversed = (reversed * 10) + a; //reverse the number
        }
        
        if(reversed == n)
        {
            System.out.println(n + " is a palindrome!");
        }
        else
        {
            System.out.println(n + " is not a palindrome!");
        }
    }
    
    
    public static void main(String args[])
    {
        checkIfPalindrome();
    }
    
}
