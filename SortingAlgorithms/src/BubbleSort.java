public class BubbleSort {

    /**
     *  The BubbleSort algorithm bubbles the largest element to the end of the array. 
     *  Move through the array swapping adjacent elements with the larger value to the right. 
     *  Keep track of the sorted elements at the end as these will not need to be sorted again. 
     *  
     */
    public static int[] bubbleSort(int[] array){

        int n = array.length;

        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if(array[j - 1] > array[j]){
                    array = swap(array, j - 1, j);
                }
                printArray(array);
            }
        }

        return array;
    }

    public static int[] swap(int[] array, int i, int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 4};
        array = bubbleSort(array);

        System.out.println();

        int[] arr2 ={3,60,35,2,45,320,5};
        arr2 = bubbleSort(arr2);
    }

}