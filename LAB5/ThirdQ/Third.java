// -Define an interface with three methods – earnings(), deductions() and bonus()
// and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
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

interface  Main{

    public void earnings();
    public void deduction();
    public void bonus(); 
}
class Manager implements Main {
    int basic;

    Manager(int x) {
        this.basic = x;
    }

    public void earnings() {
        double earn = basic + (0.80 * basic) + (0.15 * basic);
        System.out.println("Earnings - " + earn);
    }

    public void deduction() { // Fixed spelling
        double d = 0.12 * basic;
        System.out.println("Deduction - " + d);
    }
    @Override
    public abstract void bonus();
}
class SubStaff extends Manager{
    SubStaff(int x) {
        super(x);
    }

    public void bonus(){
double b = ((50*basic)/100);
System.out.println("Bonus is "+b);
    }
}

public class Third{
    public static void main(String args[]){
Scanner in = new Scanner(System.in);
int a = in.nextInt();
SubStaff obj = new SubStaff(a);
  obj.earnings();
  obj.bonus();
  obj.deduction();
    }
}