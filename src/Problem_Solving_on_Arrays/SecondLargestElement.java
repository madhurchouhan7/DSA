package Problem_Solving_on_Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {64,56,45,6,546,45,645,623424};
        int length = array.length;

        System.out.println("Array is :");
        for (int i = 0; i < length; i++){
            System.out.print(" " + array[i]);
        }
        findSecondLargestNumeber(array,length);
    }

    public static int findSecondLargestNumeber(int[] array, int length){
        int secondLargestNumber = 0;
        System.out.println();
        System.out.println("Second Largest Number is: " + secondLargestNumber);
        return secondLargestNumber;
    }
}
