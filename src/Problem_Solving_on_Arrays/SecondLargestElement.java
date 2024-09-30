package Problem_Solving_on_Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {64,56,45,6,546,45,645,623424};
        int length = array.length;

        System.out.println("Array is :");
        for (int i = 0; i < length; i++){
            System.out.print(" " + array[i]);
        }
        findSecondLargestNumber(array,length);
    }

    public static void  findSecondLargestNumber(int[] array, int length){
        int secondLargestNumber = Integer.MAX_VALUE;
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
        System.out.println();
        System.out.println("Second Largest Number is: " + secondLargestNumber);
    }
}
