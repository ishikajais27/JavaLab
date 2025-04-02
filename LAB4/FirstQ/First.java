// Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
// box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
// it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits
// from 2D.
// Input: Enter dimensions
// Output: Display the cost of plastic
import java.util.Scanner;
class TwoD{
double length;
double breadth;
 double cost;
public TwoD(double x, double y){
    this.length = x;
    this.breadth = y;
}

public void Cost(){
     cost = (length*breadth)*40;
    System.out.println("Cost of 2d Plastic- "+cost);

}
}
class ThreeD extends TwoD{
double heigth;
public ThreeD(double x,double y,double z){
    super(x, y);
    this.heigth=z;
}
public void Cost(){
    super.Cost();
    double price = (length*breadth*heigth)*60;
    System.out.println("Cost of 3D plastic - "+price);
}
}
public class First{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dimmensions of the plastic- ");
        double l = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();
      ThreeD obj = new ThreeD(l,b,h);
        obj.Cost();
    }
}