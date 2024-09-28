package Sorting;

public class SelectionSort {

    public static void selectionSort(int[] array ,int noOfElements){

        for (int i = 0; i < noOfElements - 1; i++){
            int miniMum = i;

            for (int j = i + 1; j < noOfElements; j++){
                if (array[j] < array[miniMum])
                    miniMum = j;
            }

            // swap
            int temp = array[miniMum];
            array[miniMum] = array[i];
            array[i] = temp;
        }

        System.out.println("After Selection Sort: ");
        for (int i = 0; i < noOfElements; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 4, 2};
        int size = array.length;

        System.out.println("Before Selection sort: ");
        for (int i =0; i < size; i++)
            System.out.print(array[i] + " ");

        System.out.println();
        selectionSort(array, size);
    }
}
