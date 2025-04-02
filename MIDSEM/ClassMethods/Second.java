import java.util.Scanner;
class Rectangle{
    int l;
    int b;
    int a;
    public void read(int x,int y){
        this.l=x;
        this.b =y;
    }
    public void calculate(){
        a= l*b;
    }
    public void display(){
        System.out.println(a);
    }
}
public class Second{
    public static void main(String args[]){
        Scanner in =  new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Rectangle obj = new Rectangle();
        obj.read(a,b);
        obj.calculate();
        obj.display();
    }
}