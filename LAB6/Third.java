// Aim of the program- Write a Java class which has a method called ProcessInput(). This
// method checks the number entered by the user. If the entered number is negative then
// throw an user defined exception called NegativeNumberException, otherwise it displays
// the double value of the entered number.
// Input: Enter a number 4
// Output: Double value: 8
// Input: Enter a number -4
// Output: Caught the exception
// Exception occurred: NegativeNumberException: number should be
// positive
import java.util.*;
//Genral synatx to build user defined exception
class NegativeNumberException extends  Exception{
          public NegativeNumberException(String message) {
        super(message);
          } 
}

public class Third{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int n = in.nextInt();
        try {
            if(n<0){
                throw new NegativeNumberException("You entered negative number!!!");
            }
              System.out.println((n*n));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}