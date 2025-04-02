import java.util.Scanner;
public class Second{
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter numbers- ");
    int a = in.nextInt();
    int b = in.nextInt();
    try{
 int c = a / b;
    }
    catch(ArithmeticException e){
      System.out.println("ArithmeticException caught by try-catch block");
    }
    finally{
   System.out.println("Print everytime!!!");
    }
}
}