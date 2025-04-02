import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input(String name, String aadhar_no, int acc_no, double balance) {
        this.name = name;
        this.aadhar_no = aadhar_no;
        super.input(acc_no, balance);
    }

    @Override
    void disp() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp(); // Calling parent class disp() to display account details
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person persons[] = new Person[3];

        // Taking input for three persons
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Aadhar Number: ");
            String aadhar_no = sc.nextLine();
            System.out.print("Enter Account Number: ");
            int acc_no = sc.nextInt();
            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume the newline character

            // Creating a new Person object and calling input() method
            persons[i] = new Person();
            persons[i].input(name, aadhar_no, acc_no, balance);
        }

        // Displaying details of three persons
        System.out.println("\nDisplaying Details of Three Persons:");
        for (Person person : persons) {
            person.disp();
        }

        sc.close();
    }
}
