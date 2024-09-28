package Sorting;
public class BubbleSort {

    static void bubble_sort(int[] arr, int lengthOfArray) {

        // outer loop: n - 1 => 1
        for (int i = lengthOfArray - 1; i >= 0; i--) {

            boolean didSwap = false;

            // internal loop : in the array
            for (int j = 0; j <= i - 1; j++) {

                // check if the  number at  j > j+1
                if (arr[j] > arr[j + 1]) {

                    // then swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }
            if (didSwap ==  false){
                break;
            }
        }

        System.out.println("After bubble sort: ");
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };

        int lengthOfArray = arr.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        bubble_sort(arr, lengthOfArray);
    }
}
