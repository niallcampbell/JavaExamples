package com.mycompany.javaquestions;

import java.util.Scanner;

/**
 *  Given an integer, check if it is a palindrome.
 *  e.g. 1001 is a palindrome, 1234 is not a palindrome.
 */
public class IntegerPalindrome {
    
    public static boolean checkIfPalindrome(int n) {
            
        if (reverseInteger(n) == n){
            return true;
        } else {
            return false;
        }
    }

    public static int reverseInteger(int n) {

        int reversedNum = 0;
        int lastDigit = 0;

        while(n != 0){
            lastDigit = n % 10;
            n = n / 10;
            reversedNum = (reversedNum * 10) + lastDigit;
        }

        return reversedNum;
    }
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Please enter a number to check if it is a palindrome: ");
            int n = scan.nextInt();
            boolean check = checkIfPalindrome(n);
            if(check == true){
                System.out.println(n + " is a palindrome.");
            } else {
                System.out.println(n + " is not a palindrome.");
            }

        } finally {
            scan.close();
        }
    }
    
}
