import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean[] a = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                a[c - 'a'] = true;
            }
        }

        boolean p = true;
        for (int i = 0; i < 26; i++) {
            if (!a[i]) {
                p = false;
                break;
            }
        }

        if (p) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
