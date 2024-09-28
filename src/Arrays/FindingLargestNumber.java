package Arrays;

public class FindingLargestNumber {
    public static void main(String[] args) {
        int[] number = {3,4,67,7};
        largest(number);
    }

    public static int largest(int[] arr){
        int largestNumber = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largestNumber){
                largestNumber = arr[i];
            }
        }
        System.out.println("Largest Number is : " + largestNumber);
        return largestNumber;
    }
}
