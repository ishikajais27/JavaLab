import java.util.Scanner;
interface Employee{
    void getDetails(int Empid,String Ename);
}
interface Manager extends Employee{
    void getDeptDetails(int Deptid,String Dname);
}
class Head implements Manager{

public void getDetails(int Empid,String Ename){
     System.out.println("Employee id- "+Empid+"\nEmployee name- "+Ename);
}
public void getDeptDetails(int Deptid,String Dname){
     System.out.println("Department id- "+Deptid+"\nDepartment name- "+Dname);
}
}
public class Four{
    public static void main(String args[]){
        Head obj = new Head();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee details- ");
        int eid = in.nextInt();
        in.nextLine();
        String ename = in.next();
       
          System.out.println("Enter department details- ");
int did = in.nextInt();
in.nextLine();
String dname = in.next();
obj.getDetails(eid,ename);
obj.getDeptDetails(did,dname);

    }
}