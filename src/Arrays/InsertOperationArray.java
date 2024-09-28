package Arrays;

public class InsertOperationArray {

    public static int insertSorted(int arr[], int currentSize, int elementToAdd, int maxCapacity){
        // cannot insert more element if n is already more than or equal to capacity
        if (currentSize>= maxCapacity)
            return currentSize;

        arr[currentSize] = elementToAdd;
        return (currentSize + 1);
    }

    public static void main(String[] args) {
        int[] array = new int[20];

        array[0] = 12;
        array[1] = 17;
        array[2] = 128;
        array[3] = 122;
        array[4] = 312;
        array[5] = 126;

        int maxCapacity = 20;
        int currentSize = 6;
        int elementToAdd = 69;
        int insertionIndex = currentSize;

        System.out.println("Before Insertion: ");
        for (int i=0; i<currentSize; i++){
            System.out.print(array[i] + " ");
        }

        // inserting
        currentSize = insertSorted(array, insertionIndex, elementToAdd, maxCapacity);

        System.out.println("\nAfter Insertion: ");
        for (int i=0; i<currentSize; i++)
            System.out.print(array[i]+ " ");
    }
}
