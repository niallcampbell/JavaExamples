
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
        
    }
}
