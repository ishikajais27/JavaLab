// Define two packages as – General and Marketing. In General package
// define a class ‘employee’ with data members as empid(protected), ename(private) and a public
// method as earnings() which calculate total earnings as
// earnings basic + DA (80% of basic) + HRA (15% of basic)In Marketing package define a class ‘sales’ which is extending from ‘employee’ class and has a
// method tallowance() which calculates Travelling Allowance as 5% of total earning. Write the
// programs to find out total earning of a sales person for the given basic salary amount and print
// along with the emp id.
package General;
 class Employee{
    int bs;
    Employee(int x){
      this.bs = x;

    }
    protected int empid;
    private String ename;
    public void earnings(){
      double earn = bs+((80*bs)/100) + ((15*bs)/100);
      System.out.println(earn);
    }

}

package Marketing;
import General.Employee;
class Sales extends Employee{
 Sales(int a){
    super(a);
 }
 void tallowance(){
 double ta = ((5*earn)/100);
 System.out.println(ta);
 }
}

package MainPackage;
import Marketing.tallowance;
import General.Employee;
public class Five{
    public static void main(String args[]){
        Sales obj = new Sales(10);
        obj.earnings();
        obj.tallowance();
    }
}
