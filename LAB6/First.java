// Aim of the program - Write a Java program to generate an
// ArrayIndexOutofBoundsException and handle it using catch statement.
// Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
// Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4

import java.util.*;
 class InvalidLength extends Exception {
    public InvalidLength(String message) {
        super(message);
    }
}

public class First{
  public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of the array - ");
       int n = in.nextInt();
       int arr[] = new int[n];
       try {
         if (n > 6) {
                throw new InvalidLength("Array size cannot exceed 4");
            }
           for(int i = 0;i<6;i++){
              arr[i] = in.nextInt();
           }
       } catch (Exception e) {
        System.out.println("There is some error "+ e.getMessage() );
       }
    }
}