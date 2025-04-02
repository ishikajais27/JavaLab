import java.util.Scanner;
public class diagonal{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of 2d array- ");
        int n = scan.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= scan.nextInt();
            }
        }
        int left =0,right=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==j){
                left+=arr[i][j];
               }
               if(j==n-1-i){
                right+=arr[i][j];
               }
            }
        }
        System.out.println(left);
        System.out.println(right);
    }
}