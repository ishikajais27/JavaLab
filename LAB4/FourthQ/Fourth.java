import java.util.Scanner;

class Account {
    int acc_no;
    int balance;
    
    public void input(int x, int y) {
        this.acc_no = x;
        this.balance = y;
    }
    
    public void disp() {
        System.out.println("Account number- " + acc_no + " Balance- " + balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;
    
    public void input(int a, int b, String c, int d) {
        super.input(a, b);
        this.name = c;
        this.aadhar_no = d;
    }
    
    @Override
    public void disp() {
        System.out.println("Name of the Employee- " + name + " Aadhar number- " + aadhar_no);
        super.disp();
    }
}

public class Fourth {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Person[] obj = new Person[3];
        
        for (int i = 0; i < 3; i++) {
            obj[i] = new Person(); // Initialize each object before use
            System.out.println("Enter details of " + (i + 1) + " Employee");
            int a = in.nextInt();
            int b = in.nextInt();
            String c = in.next();
            int d = in.nextInt();
            obj[i].input(a, b, c, d);
            obj[i].disp();
        }
        
 
    }
}
