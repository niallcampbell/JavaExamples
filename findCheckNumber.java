
/**
 *  Find the check number for a credit card using Luhn's algorithm.
 *  
 *  The check number is the rightmost number of a credit card. The rest of the numbers in the credit card put through Luhn's algorithm plus the check digit will sum to a number that ends in 0. 
 *  This number % 10 will equal 0. This means the credit card number is valid. 
 *  
 *  Input: Credit card number less the check number.
 *  
 *  Output: A valid check number
 *  
 *  Example: 
 *  
 *      Credit card number without check number: 453968299582439
 *      The check number for this card is: 5
 *      The total credit card number is now: 4539682995824395
 * 
 */
public class findCheckNumber
{
    public static void findCheckNum(String ccNum)
    {
        int length = ccNum.length(); //Number of digits in the credit card number
        int total = 0; //Stores the sum of all the second digits doubled
        boolean alternate = true; //True if we are on a second digit (in this case, the current rightmost number will be the second digit as the check digit has not been added to the end of the ccNum yet)
        int num = 0; //Stores the number in the ccNum we are currently on
        int checkNum = 0; //Stores the check number
        
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
        
        checkNum = 10 - (total % 10);
        
        String checkNumStr = Integer.toString(checkNum); //Convert the check number to a string
        
        System.out.println("Credit card number without check number: " + ccNum);
        
        ccNum = ccNum + checkNumStr;
        
        System.out.println("The check number for this card is: " + checkNumStr);
        System.out.println("The total credit card number is now: " + ccNum);
    }
    
}
