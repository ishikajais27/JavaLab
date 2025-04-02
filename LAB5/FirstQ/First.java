// 1. Aim of the program -Illustrate the usage of abstract class with following Java classes –
//  An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract
// method course()
//  A subclass ‘kiitian’ with course() method implementation
// Write the driver class to print the all details of a kiitian object.
// Input - Rollno - 2205180
// Registration no - 1234567890
// Output -Rollno - 2205180
// Registration no - 1234567890
// Course - B.Tech. (Computer Science &amp; Engg)
import java.util.Scanner;
 abstract class Student{
    int roll;
    int reg;
    public abstract void course();
    public void getinput(int x,int y){
        this.roll =x;
        this.reg = y;
    }

}
class Kiitian extends Student{
    public void course(){
        System.out.println("B.Tech. (Computer Science &amp; Engg)");
    }
}
public class First{
    public static void  main(String args[]){
      Scanner in = new Scanner(System.in);
      Kiitian obj = new Kiitian();
      int x = in.nextInt();
      int y = in.nextInt();
      obj.getinput(x, y);
      obj.course();
   System.out.println("Rollno - " + obj.roll);
        System.out.println("Registration no - " + obj.reg);

    }
}