// -Define an interface Motor with a data member –capacity and two methods
// such as run() and consume(). Define a Java class ‘Washing machine’ which implements this
// interface and write the code to check the value of the interface data member thru an object of the class
interface Motor{
    int capacity;
    void run();
    void consume();
}
class WashingMachine implements Motor{
void run(){
System.out.println("RUNNNN");
}
void consume(){
System.out.println("CONSUMEE");
}
}
public  class Second{
    public static void main(String args[]){
        WashingMachine obj = new WashingMachine();
        obj.consume();
        obj.run();
    }
}