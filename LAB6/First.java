import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers (space-separated):");
        String[] numbers = input.nextLine().split(" ");
        
        int size = 4; // Array size
        int[] array = new int[size];
        
        try {
            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException:" + size);
        }
        
        input.close();
    }
}
