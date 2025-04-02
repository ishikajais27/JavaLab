import java.util.Scanner;
class Box{
    double l;
    double b;
    double h;
    Box(double x,double y,double z){
      this.l = x;
      this.b = y;
      this.h = z;
    }
    public void volume(){
        double v = l*b*h;
        System.out.println("Volume of the given dimensions- "+v);
    }
}
public class First{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in); 
    double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      Box obj = new Box(a,b,c);
      obj.volume();

    }
}