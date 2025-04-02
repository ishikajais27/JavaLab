import java.util.Scanner;
public class count{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the list- ");
        int n = scanner.nextInt();
        int a[]=new int [n];
        int count=0;
        int temp;
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
      for(int i=0;i<n;i++){
            count =1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]&& a[i]!=-1){
                    a[j]=-1;
                    count++;
                }
                if(a[i]==-1){
                    i=i+1;
                }
            }
            if(a[i]!=-1){
                System.out.println("Occurrence of "+ a[i]+" = "+ count);
            }
      }
    }
}