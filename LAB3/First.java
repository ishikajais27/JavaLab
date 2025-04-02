// Aim of the program :Write a class file – box with three data members(length, width, height)
// and a method volume() . Also implement the application class Demo where an object of the
// box class is created with user entered dimensions and volume is printed.
// Input: length,width and height.
// Output: Volume
import java.util.Scanner;
class Box{
  double length;
   double breadth;
   double height;
   double volume;
   public void Volume(double x,double y,double z){
   this.length=x;
   this.breadth=y;
   this.height=z;
  volume = length*breadth*height;
  System.out.println("Vloume of given dimensions- "+volume);
   }
}
public class First{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
  System.out.println("Enter length of box - ");
  double l = scan.nextInt();
   System.out.println("Enter breadth of box - ");
  double b = scan.nextInt();
   System.out.println("Enter heigth of box - ");
  double h = scan.nextInt();
  Box obj = new Box();
  obj.Volume(l,b,h);
  }
}