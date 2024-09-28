package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};

        int lengthOfArray = array.length;

        System.out.println("Before Sorting :");
        for (int i =0; i < lengthOfArray; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
        insertionSort(array, lengthOfArray);

    }

    public static void insertionSort(int[] array, int length){
        for (int i = 0; i < length ; i++){
            int j = i;
            while (j > 0 && array[j-1] > array[j]){
                // swapping
                int temp;
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        System.out.println("After Sorting :");
        for (int i = 0; i < length; i++){
            System.out.print(" "+array[i]);
        }
    }
}
