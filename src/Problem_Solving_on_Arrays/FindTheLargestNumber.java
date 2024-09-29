package Problem_Solving_on_Arrays;

public class FindTheLargestNumber {

    public static void main(String[] args) {

        int[] array= {23,4,5,4,6,5,7,6,8,7,7,8,67,6};
        int length = array.length;
        System.out.println("Array is :");
        for (int i =0; i < length; i++){
            System.out.print(" " + array[i]);
        }
        findLargestNumber(array, length);
    }
    public static int findLargestNumber(int[] array, int length){
        int maxNumber = 0;
        for (int i = 0; i < length; i++){
            if (array[i] > maxNumber){
                maxNumber = array[i];
            }
        }
        System.out.println();
        System.out.println("Max number is: " +maxNumber);
        return maxNumber;
    }
}