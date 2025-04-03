// Aim of the program -Define an interface Motor with a data member –capacity and two methods
// such as run() and consume(). Define a Java class ‘Washing machine’ which implements this
// interface and write the code to check the value of the interface data member thru an object of the
// class.
// Input - mentioned in the program
// Output - Capacity of the motor is -----
 interface Motor{
   int Capacity=0;  //interface varibales are static and final so its important to initialize it
  public void run();   //interface method does not have body
    public void consume();
 }
 class WashingMachine implements Motor{
 public void run(){
System.out.println("Runn");
    }
 public  void consume(){
System.out.println("Consume");
    }
 }
 public class Second{
    public static void main(String args[]){
        WashingMachine obj = new WashingMachine();
        obj.consume();
        obj.run();
    }
 }