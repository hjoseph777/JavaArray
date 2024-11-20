package com.array;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class ArrayApp 
{
    public static void main( String[] args )
    {
    
    
      // Prompt for array elements
      int size;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      size = input.nextInt();
      int[] myArray = new int[size];
      
      for (int i = 0; i < size; i++) {
        System.out.print("Enter element " + (i + 1) + ": ");
        myArray[i] = input.nextInt();
    }

        // Display the array
        System.out.println("\nDisplaying the array:");
        ArrayUtitlities.display(myArray);
        
        // Calculate and display total
        System.out.println("\nCalculating total:");
        ArrayUtitlities.totalOfElements(myArray);
        
        input.close();
    
    }
}
