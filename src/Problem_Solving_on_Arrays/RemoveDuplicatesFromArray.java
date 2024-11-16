package Problem_Solving_on_Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1,2,4,55,6,7,8,9};
        int length = array.length;
        findDuplicates(array, length);
        sortTheArray(array, length);
    }

    public static void findDuplicates(int[] array, int length){

    }

    public static void sortTheArray(int[] array, int length){
        for (int i=0; i<length; i++){
            int mini = i;

            for (int j=i; j<length ; j++){
                if (array[j] < array[mini]){
                    mini = j;
                }
                // swap
                int temp = array[mini];
                array[mini] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(" " + array[i ]);
        }
    }
}
