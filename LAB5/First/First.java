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

abstract class Stud{
    int roll,reg;
    void getInput(int a,int b){
        this.roll =a;
        this.reg =b;
    }
    abstract void course();
}
class Kittian extends Stud{
       void course(){
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
       }
}
public class First{
    public static void main(String args[]){
        Scanner in  =new Scanner(System.in);
        Kittian obj = new Kittian();
        System.out.println("Enter Roll No:");
        int roll = in.nextInt();
        System.out.println("Enter Registration No:");
        int reg = in.nextInt();
        obj.getInput(roll,reg);
        System.out.println("Roll No - "+obj.roll);
        System.out.println("Registration No - "+obj.reg);
        obj.course();    
    }
}