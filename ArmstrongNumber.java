
package com.mycompany.javaquestions;

import java.util.Scanner;

/**
 *  A number is called an Armstrong number if it is equal to the cube of its each digit.
 * 
 *  e.g. 153 is an Armstrong number because 153= 1+ 125+27 which is equal to 1^3+5^3+3^3.
 *  e.g. 371
 * 
 *  
 * 
 */
public class ArmstrongNumber {
    
    public static boolean checkIfArmstrongNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scan.nextInt();
        
        int temp = n;
        int remainder = 0;
        int total = 0;
        
        while(temp != 0)
        {
            //get the value at the end of the number
            remainder = temp % 10;
            total += remainder * remainder * remainder; //add the remainder cubed to the total
            temp = temp/10; //cut off the last digit
        }
        
        if(total == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public static void main(String args[])
    {
        boolean check = checkIfArmstrongNumber();
        System.out.println(check);
    }
    
}
