import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String a = sc.nextLine();
        System.out.println("Enter 1st string");
        String b = sc.nextLine();
        int count = 0;

        if(a.length()!=b.length()){
            System.out.println("Strings are not same!!!");
        }
        else{
            for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                System.out.println("Given strings are not equal!!");
                break;
            } else {
                count++;
            }
        }
        if (count == (a.length())) {
            System.out.println("Strings are same");
        }
        }
    }
}
