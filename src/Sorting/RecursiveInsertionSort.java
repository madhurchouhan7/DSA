package Sorting;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] array = {6,5,4,3,2,1};
        int lengthOfArray = array.length;

        System.out.println("Before Sorting :");
        for (int i=0; i < lengthOfArray; i++){
            System.out.print(" " + array[i]);
        }

        recursiveInsertionSort(array, lengthOfArray,0);
        System.out.println();
        System.out.println("After Sorting :");
        for (int i=0; i < lengthOfArray; i++){
            System.out.print(" " + array[i]);
        }
    }

    public static void recursiveInsertionSort(int[] array, int length, int index){
        if (index == length) return;
        int j = index;
        while (j > 0 && array[j-1] > array[j]){
            // Swapping
            int temp = array[j-1];
            array[j - 1] = array[j];
            array[j] = temp;
            // backward
            j--;
        }
        recursiveInsertionSort(array, length, index + 1);
    }
}
