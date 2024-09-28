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
    }

    public static void recursiveBubbleSort(int[] array, int lengthOfArray){
        if (lengthOfArray == 1)
            return;

        for (int j=0; j<lengthOfArray - 1; j++){
            if (array[j] > array[j+1]){
                // swapping
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        recursiveBubbleSort(array, lengthOfArray - 1);
        System.out.println();
        System.out.println("After Recursive Bubble Sort :");
        for (int i=0; i < lengthOfArray; i++){
            System.out.print(" " + array[i]);
        }
    }
}
