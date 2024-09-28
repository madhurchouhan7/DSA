package Sorting;
// saving these files on github
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        int lengthOfArray = array.length;

        System.out.println("Before Sorting : ");
        for (int j : array) {
            System.out.print(" " + j);
        }

        mergeSort(array, lengthOfArray);
    }
    public static  void mergeSort(int[] array, int length){
        System.out.println();
        System.out.println("After Sorting : ");
        for(int i =0; i < length; i++){
            System.out.print(" " + array[i]);
        }
    }
}
