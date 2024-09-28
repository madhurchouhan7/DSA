package Arrays;

public class SearchOperationArray {

    //* function to implement search operation
    // taking 3 parameters : array, length of the array, the number to find
    public static int findElement(int[] array, int num, int numberToFind){

        for (int i=0; i < num; i++){
            // if number is found, return the number
            if (array[i] == numberToFind) {
                return i;
            }
        }
        // else return -1 : means element is not found
        return -1;
    }

    public static void main(String[] args) {

        // the array
        int arr[] = {435,768,9809,454};

        int lengthOfArray = arr.length;

        // the number we need to find out
        int findThisNumber = 454;

        // index of the number that found.
        int position = findElement(arr, lengthOfArray, findThisNumber);

        if (position == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element Found at Position: " + (position + 1));
    }
}
