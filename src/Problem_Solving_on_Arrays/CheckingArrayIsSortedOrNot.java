package Problem_Solving_on_Arrays;

public class CheckingArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        int length = array.length;

        System.out.println("Array is: ");
        for (int i=0; i<length; i++){
            System.out.print(" " + array[i]);
        }
        checkingArrayIsSorted(array, length);
    }
    public static void checkingArrayIsSorted(int[] array, int length){
        boolean isSorted = true;

        for (int i =0; i <length; i++){
            if (array[i] > array[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("\n Array is Sorted!");
        }
        else {
            System.out.println("\n Array is Not Sorted");
        }
    }
}

