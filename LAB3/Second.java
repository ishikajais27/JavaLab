//Write a program in Java to create a class Rectangle having data members
//length and breadth and three methods called read, calculate and display to read the values of
//length and breadth, calculate the area and perimeter of the rectangle and display the result
import java.util.Scanner;
public class Second{
    int l,b,area,p;
    void read(int x,int y){
        l=x;
        b=y;
    }

    void calculate(){
        area  = l*b;
         p =2*(l+b);
    }
    void display(){
        System.out.println(area);
        System.out.println(p);
    }
    public static void main(String args[]){
         Second obj = new Second();
         Scanner scan = new Scanner(System.in);
         int l = scan.nextInt();
         int b = scan.nextInt();
         obj.read(l,b);
         obj.calculate();
         obj.display();
    }
}