package com.array;

public class ArrayUtitlities {
    public static void display(int[] array) {
    System.out.println("displaying each element of the array ");
        System.out.println();
        for (int element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static int totalOfElements(int[] array) {
        int total = 0;
        System.out.println("Adding elements of the array:");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            System.out.println("Adding " + array[i] + " -> Running total: " + total);
        }
        System.out.println("Total of elements added in the array is: " + total);
        return total;

}
}