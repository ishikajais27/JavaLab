import java.util.Scanner;
public class fifth{
    public void area(int side){
        System.out.println("Area of Square - "+(side*side));
    }
    public void area(double r){
        double a = (3.14) * (r * r); 
        System.out.println("Area of corcle - "+a);
    }
    public void area(double base , double height){
      double a = (1/2) * (base*height);
      System.out.println("Area of Triangle - "+a);
    }
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius of circle- ");
        double r = scan.nextDouble();
        System.out.println("enter the base of triangle- ");
        double b = scan.nextDouble();
        System.out.println("enter the radius of circle- ");
        double h = scan.nextDouble();
        System.out.println("enter the side of square- ");
        int s = scan.nextInt();
        fifth obj = new fifth();
        obj.area(r);
        obj.area(b,h);
        obj.area(s);
    }
}