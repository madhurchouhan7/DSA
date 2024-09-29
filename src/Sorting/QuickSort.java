package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1 ,0};
        int lengthOfArray = array.length;

        System.out.println("Before Sorting : ");
        for (int i = 0; i < lengthOfArray; i++){
            System.out.print(" " + array[i]);
        }

        quickSort(array, lengthOfArray);
    }

    public static void quickSort(int[] array, int length){

    }
}
