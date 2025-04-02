import java.util.Scanner;
public class firstname{
    public static void main(String arge[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("enter the first name- ");
     String first = scanner.nextLine();
      System.out.println("enter the last name- ");
     String last = scanner.nextLine();
     System.out.print(last + " "+first);

    }
}