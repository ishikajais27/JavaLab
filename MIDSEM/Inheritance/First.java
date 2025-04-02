// Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
// box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
// it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits
// from 2D.
import java.util.Scanner;
class TwoD{
int l;
int b;
public TwoD(int x,int y){
    this.l = x;
    this.b =y;
}
void cost(){
int a = l*b;
System.out.println("Cost of 2D - "+(a*40));
}
}
class ThreeD extends TwoD{
int h;
public ThreeD(int x,int y,int z){
   super(x,y);
   this.h = z;
}
void cost(){
    super.cost();
int v = l*b*h;
System.out.println("Cost of 3D - "+(v*60));
}
}
public class First{
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();
     ThreeD obj = new ThreeD(a,b,c);
     obj.cost();
    }
}