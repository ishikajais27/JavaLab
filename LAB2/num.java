import java.util.Scanner;
public class num{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 10 numbers- ");
        int a[]= new int[10];
        for(int i=0;i<10;i++){
             a[i]=scanner.nextInt();
        }
         System.out.println("even numbers- ");
    for(int i=0;i<10;i++){
        if(a[i]%2==0){
            System.out.println(a[i]);
        }
    }
     System.out.println("odd numbers- ");
    for(int i=0;i<10;i++){
        if(a[i]%2!=0){
            System.out.println(a[i]);
        }
    }
    }
   
}