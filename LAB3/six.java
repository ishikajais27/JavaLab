import java.util.Scanner;
public class six {
    int a;
    int b;
    public six(){
        a=0;
        b=0;
    }
    public six(int x,int y){
        a=x;
        b=y;
    }
    public void display(){
        System.out.println("Area of Rectangle - "+ (a*b));
    }
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int l = scan.nextInt();
    int b = scan.nextInt();
    six obj = new six(l,b);
    obj.display();
}
}

