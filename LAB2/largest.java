import java.util.Scanner;
public class largest{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers- ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1);
        }
        else if(n1<n2 && n2>n3){
            System.out.println(n2);
        }
         else if(n3>n2 && n1<n3){
            System.out.println(n3);
        }
    }
}