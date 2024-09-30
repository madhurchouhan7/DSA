package Problem_Solving_on_Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int length = array.length;

        System.out.println("Array is :");
        for (int i = 0; i < length; i++){
            System.out.print(" " + array[i]);
        }
        findSecondLargestNumber(array,length);
    }

    public static void  findSecondLargestNumber(int[] array, int length){

        // assigning both the least number any variable can have.
        int secondLargestNumber = Integer.MIN_VALUE;
        int largestNumber = Integer.MIN_VALUE;

        for (int i=0; i < length; i++){
            if (array[i] > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = array[i];
            }
            else if(array[i] > secondLargestNumber && array[i] != largestNumber){
                secondLargestNumber = array[i];
            }
        }

        if (secondLargestNumber == Integer.MIN_VALUE){
            System.out.println("\n No  Second Largest Element Found");
        }
        else {
            System.out.println("\nSecond Largest Number is: " + secondLargestNumber);
        }
    }
}
