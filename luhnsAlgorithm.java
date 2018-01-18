
/**
 *  Luhn's Algorithm
 *  
 *  Parameter: String representing a credit card number.
 *  
 *  Checks whether the ccNum is valid or not using Luhn's Algorithm.
 *  
 *  Luhn's Algorithm:
 *  
 *      1. From the righmost digit (which is called the check digit), and moving left, double the value of every second digit. If the result is greater than 9, then add the two digits that make up the number together
 *          (e.g. 9 * 2 = 18, then 1 + 8 = 9)
 *      
 *      2. Sum all of the numbers together
 *      
 *      3. If sum % 10 == 0, then the number is valid (i.e. the total ends in 0). 
 *  
 *  Outputs VALID if the ccNum is valid, otherwise INVALID if not. 
 *  
 *  Sample input: 4539682995824395 = VALID
 * 
 */

public class luhnsAlgorithm
{
    public static void luhnsAlgorithm(String ccNum)
    {
        int length = ccNum.length(); //Number of digits in the credit card number
        int total = 0; //Stores the sum of all the second digits doubled
        boolean alternate = false; //True if we are on a second digit
        int num = 0; //Stores the number in the ccNum we are currently on
        
        //Loop through the credit card number starting with the rightmost number
        for(int i = length -1; i >= 0; i--)
        {
            num = Integer.parseInt(ccNum.substring(i, i + 1)); //Convert the number to an int
            
            //If it is a second digit, double it
            if(alternate == true)
            {
                num *= 2; //Double the number
                
                //If the number doubled is greater than 9, add the two digits in the number together
                if (num > 9)
                {
                    num = 1 + (num % 10); //The first digit will always be 1 if the number doubled is greater than 9. 
                }
            }
            
            total += num; //Add num to the sum of all digits
            alternate = !alternate; //Change whether it is a second digit or not
        }
        
        if(total % 10 == 0)
        {
            System.out.print("VALID");
        }
        else
        {
            System.out.print("INVALID");
        }
        
    }
}
