import java.util.Scanner;
 class plate{
    int l,b;
    public plate(int x,int y){
        l=x;
        b=y;
        System.out.println("Dimmensions - "+l+" "+b);
    }
}
 class box extends plate{
int h;
public box(int x,int y,int z){
    super(x,y);
    h=z;
    System.out.println("Dimmensions - "+l+" "+b+" "+h);
}
}
 class woodBox extends box{
  int t;
  public woodBox(int x,int y,int z,int a){
    super(x, y, z);
    t=a;
    System.out.println("Dimmensions - "+l+" "+b+" "+h+" "+t);
  }
}
public class Second{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the dimmensions- ");
      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();
      int a = in.nextInt();
      woodBox obj = new woodBox(x, y, z, a);
   
  }
}
