// Illustrate the execution of constructors in multi-level inheritance with three
// Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
// where box inherits from plate and woodbox inherits from box class. Each class has constructor where
// dimensions are taken from user.
class Plate{
int length;
int width;
Plate(int x,int y){
this.length = x;
this.width = y;
}
}
class Box extends Plate{
int height;
Box(int x,int y,int z){
super(x,y);
this.height= z;
}
}
class Woodbox extends Box{
int thick;
Woodbox(int a,int b,int c,int d){
super(a,b,c);
this.thick = d;
}
}
public class Second{
    public static void main(String args[]){
        Woodbox obj = new Woodbox(2,2,2,2);
        System.out.println(obj.length);
    }
}
