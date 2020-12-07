
/**
 * Practice code for Java Generics. 
 *
 */
public class Generics
{
    public static <E> void printArray(E[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        
        System.out.println();
    }
    
    public static <E extends Comparable<E>> E maximumValue(E [] array){
        
        if(array.length == 0){
            return null;
        }
        
        E max = array[0];
        
        for(int i = 1; i < array.length; i++){
            
            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
            
        }
        
        return max;
    }
    
    public static void main(String args[]){
        
        Integer [] arr1 = {1,2,3};
        Double [] arr2 = {1.0, 2.0, 3.0};
        String [] arr3 = {"Hello", "World", "!"};
        
        System.out.println("Integer array:");
        printArray(arr1);
        
        System.out.println("Double array:");
        printArray(arr2);
        
        System.out.println("String array:");
        printArray(arr3);
        
        Integer [] arr4 = {32, 45, 21, 89, 56};
        System.out.println(maximumValue(arr4));
        
        Double [] arr5 = {56.0, 34.4, 56.1, 24.3, 14.9};
        System.out.println(maximumValue(arr5));
    }
}
