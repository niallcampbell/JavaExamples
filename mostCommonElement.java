
public class mostCommonElement
{
    public static void main()
    {
        int[] a = {1,1,2,3,2,4,5,2,1,1,2};
        int freq = mostFreq(a);
        System.out.print(freq);
    }
    
    public static int mostFreq(int[] a)
    {
      int mode = a[0]; //Will store the most common element. Initially set to the first element
      int count = 1; //Will store the highest count of the most common number
      int temp = 0; //Stores a number to check how many times it appears
      int tempCount = 0; //Stores the amount of times the temp number appears
      
      //Loop through the array up to the last slot
      for (int i = 0; i < (a.length); i++)
      {
            temp = a[i];
            
            tempCount = 0; //Stores the number of times the element at a[i] appears
            
            //Count the number of times the temp number appears
            for (int j = i+1; j < a.length; j++)
            {
              //If the number appears again increase temp count
              if (temp == a[j])
              {
                  tempCount++;
              }
            }
            
            //If the tempcount exceeds the previous max count then temp becomes the new most common number
            if (tempCount > count)
            {
              mode = temp;
              count = tempCount;
            }
            else if(tempCount == count)
            {
                //Select the smaller number
                if(mode > temp)
                {
                    mode = temp;
                }
            }
            
      }
      return mode;
    }
}
