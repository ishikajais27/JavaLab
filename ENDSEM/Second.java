import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int len = Math.min(a.length(), b.length());
        int res = 0;

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                res = a.charAt(i) - b.charAt(i);
                break;
            }
        }

        if (res == 0)
            res = a.length() - b.length();

        if (res == 0)
            System.out.println("Equal");
        else if (res < 0)
            System.out.println("First is smaller");
        else
            System.out.println("First is larger");
    }
}
