// Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
// bonus() method. Write the complete program to find out earnings, deduction and bonus of a
// substaff with basic salary amount entered by the user as per the following guidelines –
// earnings basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF 12% of basic
// bonus 50% of basic
// Input -Basic salary - 50000
// Output -Earnings - 97500
// Deduction -6000
// Bonus - 25000
import java.util.Scanner;

interface Main {
    public void earnings(int basic);
    public void deductions(int basic);
    public void bonus(int basic);
}

class Manager implements Main {
    double earn;
    double deduct;

    public void earnings(int basic) {
        earn = basic + (0.8 * basic) + (0.15 * basic);
        System.out.println("Earning - " + earn);
    }

    public void deductions(int basic) {
        deduct = basic * 0.12;
        System.out.println("Deduction - " + deduct);
    }

    public void bonus(int basic) {
        // Empty implementation (Manager does not handle bonuses)
    }
}

class SubStaff extends Manager {
    double gain;

    @Override
    public void bonus(int basic) {
        gain = basic * 0.5;
        System.out.println("Bonus - " + gain);
    }
}

public class Third {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        SubStaff obj = new SubStaff(); 
        int z = in.nextInt();
        obj.earnings(z);
        obj.deductions(z);
        obj.bonus(z);
      
    }
}
