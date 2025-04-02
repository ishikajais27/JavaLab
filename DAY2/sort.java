import java.util.Scanner;
public class sort{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the list- ");
        int n = scanner.nextInt();
        int a[]=new int [n];
        int temp;
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int flag=0;
            for(int j=0;j<n-1-i;j++){
            if(a[j]>a[j+1]){
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                 flag=1;
            }
            }
            if(flag==0){
                break;
            }
        }
        System.out.println("list after sorting- ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}