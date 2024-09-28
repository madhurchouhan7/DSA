package Sorting;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        int lengthOfArray = array.length;

        System.out.println("Before Sorting : ");
        for (int i=0; i < lengthOfArray; i++){
            System.out.print(" "+ array[i]);
        }
        recursiveBubbleSort(array, lengthOfArray);

        System.out.println();
        System.out.println("After Recursive Bubble Sort :");
        for (int i=0; i < lengthOfArray; i++){
            System.out.print(" " + array[i]);
        }
    }

    public static void recursiveBubbleSort(int[] array, int lengthOfArray){
        // base Case for Recursion:
        if (lengthOfArray == 1)
            return;
        boolean didSwap = false;

        for (int j=0; j<lengthOfArray - 1; j++){
            if (array[j] > array[j+1]){
                // swapping
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                didSwap = true;
            }
        }
        if (didSwap == false)
            return;
        recursiveBubbleSort(array, lengthOfArray - 1);
    }
}
