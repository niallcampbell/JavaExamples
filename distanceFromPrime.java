/**
*   Read in a number N and output the distance between the prime number that precedes it, and the prime number that follows it. 
*   
*   If N is a prime number, then output the distance to the subsequent prime number. 
*
*   E.g. If N = 7, then output = 4 because the next prime is 11, which is 4 away from 7. 
*   
*   E.g. N = 10, Output = 4. 
*   
*   Constraints: 2 <= N <= 1000
*   
*/

public class distanceFromPrime
{
    public static int distanceFromPrimeMethod(int N)
    {
        //First check if the number is Prime
        boolean prime = false;
        
        prime = isPrime(N);
        
        //N is not a prime number
        if(prime == false)
        {
            int before = 0; //Stores the prime number before N
            int after = 0; //Stroes the prime number after
            
            //Get the prime number before
            for(int i = N; i > 0; i--)
            {
                if(isPrime(i))
                {
                    before = i;
                    break;
                }
            }
            
            //Get the prime number after
            int i = N +1;
            while(i < 1000)
            {
                if(isPrime(i))
                {
                    after = i;
                    break;
                }
                else
                {
                    i++;
                }
            }
            
            return (N - before) + (after - N);
        }
        else //N is a prime number
        {
            //Find the next prime after N
            int after = 0; //Stroes the prime number after
            int i = N +1;
            while(i < 1000)
            {
                if(isPrime(i))
                {
                    after = i;
                    break;
                }
                else
                {
                    i++;
                }
            }
            
            return (after - N);
        }
    }
    
    //Returns whether an in is a prime number 
    public static boolean isPrime(int N)
    {
        int count = 0;
        
        boolean prime = false;
        
        for(int i = 1; i <= N; i++)
        {
            if(N % i == 0)
            {
                count++;
            }
        }
        
        if(count == 2)
        {
            prime = true;
        }
        
        return prime;
    }
}
