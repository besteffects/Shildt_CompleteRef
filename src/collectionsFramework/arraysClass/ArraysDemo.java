package collectionsFramework.arraysClass;
//Demonstrate Arrays

import java.util.Arrays;

class ArraysDemo {
    public static void main(String[] args) {
        //Allocate and initiate array
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        // Display, sort and display the array.
        System.out.print("Original contents: ");
        display(array);
        System.out.print("Sorted: ");
        display(array);

        //Fill and display the array
        Arrays.fill(array, 2, 6, -1);
        System.out.print("After fill: ");
        display(array);
    }

    static void display(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(array);
    }
}
