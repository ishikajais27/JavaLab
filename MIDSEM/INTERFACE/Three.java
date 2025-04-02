// -Define an interface with three methods – earnings(), deductions() and bonus()
// and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
// Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
// bonus() method. Write the complete program to find out earnings, deduction and bonus of a
// substaff with basic salary amount entered by the user as per the following guidelines –
// earnings basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF 12% of basic
// bonus 50% of basic
interface Bank{
    void earnings();
    void deduction();
    void bonus();
}
class Manager implements Bank{
    int bs;
    Manager(a){
        this.bs=a;
    }
    void earnings(){
      int earn = bs +((80*bs)/100) +((15*bs)/100);
      System.out.println(earn);
       }
    void deduction(){
  int deduct = ((12*bs)/100);
      System.out.println(deduct);
    }
}
class substaff extends Manager{
    void bonus(){
  int extra =((50*bs)/100);
      System.out.println(extra);
    }
}
public class Three{
    public static void main(String args[]){
        
    }
}