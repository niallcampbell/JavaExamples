package src;

public class StringRotation {

    /**
     *  A k-rotation on a string takes the last k characters 
     *      of the string and attaches it to the beginning of the string in the same order.
     * 
     *  e.g. 123456 -> 456123
     */

    public static boolean isRotation(String s1, String s2){

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if(arr1.length != arr2.length){
            return false;
        }

        int len = arr1.length;

        // find the index where the rotation begins
        int k = 0;
        while(arr1[0] != arr2[k]){
            k++;
        }

        //check if the last k elements of arr1 == first k elements of arr2
        int i = len -k;
        int j = 0;
        while(i < len){
            if(arr1[i] != arr2[j]){
                return false;
            }
            i++;
            j++;
        }

        //check the last k elements of arr1 == first k elements of arr2
        i = 0;
        j = k;
        while(i < k){
            if(arr1[i] != arr2[j]){
                return false;
            }
            i++;
            j++;
        }

        return true;
    }

    /**
     *  Alternative method to check if two strings are a rotation of each other. 
     *  Concatenate s1 with itself and check if s2 is a substring. 
     */
    public static boolean isRotationAlt(String s1, String s2){

        s1 = s1.concat(s1);
        return s1.contains(s2);
    }

    public static void printIsRotation(String s1, String s2){

        if(isRotation(s1, s2)){
            System.out.println(s1 + " and " + s2 + " are rotations of each other. ");
        } else{
            System.out.println(s1 + " and " + s2 + " are not rotations of each other. ");
        }
    }

    public static void printIsRotationAlt(String s1, String s2){

        if(isRotationAlt(s1, s2)){
            System.out.println(s1 + " and " + s2 + " are rotations of each other. ");
        } else{
            System.out.println(s1 + " and " + s2 + " are not rotations of each other. ");
        }
    }
    
    public static void main(String[] args) {
        printIsRotation("IrelandUSAEngland", "EnglandIrelandUSA");
        printIsRotation("123456", "456123");
        printIsRotation("IrelandUSA", "EnglandIreland");

        System.out.println();
        printIsRotationAlt("IrelandUSAEngland", "EnglandIrelandUSA");
        printIsRotationAlt("123456", "456123");
        printIsRotationAlt("IrelandUSA", "EnglandIreland");
    }
}
