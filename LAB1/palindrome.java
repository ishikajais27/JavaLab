import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number- ");
        int num = scanner.nextInt();
        int n= num;
               int revnum=0;
        while(n!=0){
         int digit = n %10;
         revnum = revnum * 10 + digit;
         n/=10;
        }
        if(num == revnum){
            System.out.println("Entered number is PALINDROME");
        }
        else{
            System.out.println("Entered number is not PALINDROME");
            
        }
    }

}