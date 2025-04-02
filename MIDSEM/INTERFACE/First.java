// This question is asking you to demonstrate the usage of an abstract class in Java by creating two
// classes: an abstract class named 'student' with specific data members and methods, and a subclass
// named 'kiitian' that extends the abstract class and provides an implementation for the abstract
// method. Additionally, you are required to write a driver class that will create an object of the
// 'kiitian' class and print out all the details of that object.
abstract class Student{
    int roll;
    int regNo;
    void getInput(int x,int y){
        this.roll = x;
        this.regNo = y;
    }
    abstract void course();
}
class Kiitian extends Student{
   void getInput(int a,int b){
    super.getInput(a,b);
   }
   void course(){
 System.out.println("Course");
   }
   void disp(){
    System.out.println("Roll no- "+roll+"\nReg no- "+regNo);
   }
}
public class First{
    public static void main(String args[]){
        Kiitian obj = new Kiitian();
        obj.getInput(2329037, 12345);
        obj.disp();
        obj.course();
    }
}