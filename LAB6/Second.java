// Aim of the program- Write a Java program to handle an ArithmeticException using try,
// catch, and finally block.
// Input: Operand values for division operation mentioned in the program
// Output: ArithmeticException caught by try-catch-finally block
import java.util.Scanner;
public class Second{
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter operand for divison- ");
     int n1 = in.nextInt();
     int n2 = in.nextInt();
     try {
         int n3 = n1/n2;
         System.out.println(n3);
     } catch (Exception e) {
        System.out.println(e.getMessage());
     }
     finally{
        System.out.println("Execution Completed!!!");
     }
    }
}