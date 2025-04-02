// Write a program in Java having three classes Apple, Banana and
// Cherry. Class Banana and Cherry are inherited from class Apple and each class have their
// own member function show() . Using Dynamic Method Dispatch concept display all the show()
// method of each class.
class Apple{
void show(){
    System.out.println("APPLE");
}
}
class Banana extends Apple{
void show(){
    System.out.println("BANANA");
}
}
class Cherry extends Banana{
void show(){
    System.out.println("CHERRY");
}
}
public class Three{
    public static void main(String args[]){
        Apple newApple;
        newApple = new Banana();
        newApple.show();
        newApple = new Cherry();
        newApple.show();
    }
}   