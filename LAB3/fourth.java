public class fourth{
    //subtraction methods
    public void sub(int x,int y){
        System.out.println(x-y);
    }
     public  void sub(int x,int y,int z){
        System.out.println(x-y-z);
    }
     public  void sub(double x,double y,double z){
        System.out.println(x-y-z);
    }
    public  void sub(double x, double y){
        System.out.println(x-y);
    }
    public static void main(String args[]){
        fourth obj = new fourth();
        obj.sub(20, 30);
        obj.sub(40,20,10);
        obj.sub(15.5,5.2);
        obj.sub(20.5,15.5,4.8);
    }
}
