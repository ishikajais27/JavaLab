// Aim of the program : Write a program in java to input and display the details of n number of
// students having roll, name and cgpa as data members. Also display the name of the
// student having lowest cgpa.
import java.util.Scanner;
class Students{
    int roll;
    String name;
    double cgpa;
    Students(int x,String y,double z){
        this.roll = x;
        this.name = y;
        this.cgpa = z;
    }
    void display(){
        System.out.println("Student Details-\n"+"Name- "+name+" Roll no- "+roll+" CGPA- "+cgpa);
    }
}
public class Third{
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     Students[] obj = new Students[n];
     for(int i=0;i<n;i++){
System.out.println("Enter details of "+i+1+" Student- ");
int a = in.nextInt();
String b = in.next();
double c = in.nextDouble();
obj[i] = new Students(a,b,c);
     }
     for(Students x : obj){
        x.display();
     }
    }
}