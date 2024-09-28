package Arrays;

import java.util.Arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        int rows  = 4, column = 4;

        int[][] array = new int[rows][column];

        int value = 1;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < column; j++){
                array[i][j] = value;
                value++;
            }
        }

        System.out.println("The 2D Array is: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<column; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
