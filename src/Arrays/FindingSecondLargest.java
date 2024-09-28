package Arrays;
import java.util.Arrays;

public class FindingSecondLargest {
    public static void main(String[] args) {
        int[] number = {23,54,678,89,1000};
        findSecondLargestNumber(number);
    }

    public static void findSecondLargestNumber(int[] array){
        Arrays.sort(array);
        int secondLargestNumber, largestNumber;

        largestNumber = array[array.length - 1];
        secondLargestNumber = array[array.length - 2];
        System.out.println("The largest element of the array is " + largestNumber+ " and the second largest element is " + secondLargestNumber + ".");
    }
}
