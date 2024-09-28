package Arrays;

public class DeleteOperationArray {

    // Finding element through linear search
    public static int findElement(int[] array, int currentSize, int elementToFind) {
        for (int i = 0; i < currentSize; i++) {
            if (array[i] == elementToFind) {
                return i;  // Return the index if the element is found
            }
        }
        return -1;  // Return -1 if the element is not found
    }

    public static int deleteElement(int[] array, int currentSize, int elementToDelete) {
        int position = findElement(array, currentSize, elementToDelete); // Find the position of the element to delete

        if (position == -1) {
            System.out.println("Element not found!");
            return currentSize;  // Return the original size if the element is not found
        }

        // Shift elements to the left to fill the gap left by the deleted element
        for (int i = position; i < currentSize - 1; i++) {
            array[i] = array[i + 1];
        }
        return currentSize - 1;  // Return the new size of the array after deletion
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 56, 87, 21, 2, 5, 6}; // Initialize the array with some elements
        int currentSize = array.length; // Current number of elements in the array
        int elementToDelete = 87; // Element to delete from the array

        System.out.println("Array before deletion:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i] + " ");
        }

        // Delete the element
        currentSize = deleteElement(array, currentSize, elementToDelete);

        System.out.println("\nArray after deletion:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}