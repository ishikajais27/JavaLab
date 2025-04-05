// Aim of the Program: Write a program to create user defined exceptions called
// HrsException, MinException and SecException. Create a class Time which contains data
// members hours, minutes, seconds and a method to take a time from user which throws
// the user defined exceptions if hours (&gt;24 &amp;&lt;0),minutes(&gt;60 &amp;&lt;0),seconds(&gt;60 &amp;&lt;0).

import java.util.*;
class HrsException extends Exception{
 public HrsException(String m){
    super(m);
 }
}
class MinException extends Exception{
 public MinException(String m){
    super(m);
 }
}
class SecException extends Exception{
 public SecException(String m){
    super(m);
 }
}
class Time{
    int hr,min,sec;
    Time(int x,int y,int z){
        try {
            this.hr = x;
        this.min = y;
        this.sec = z;
        if(hr>24 || hr<0){
            throw new HrsException("Invalid hour input");
        }
        else  if(min>60 || min<0){
            throw new HrsException("Invalid min input");
        }
       else  if(min>24 || sec<0){
            throw new HrsException("Invalid sec input");
        }
       System.out.println("Time - "+hr+":"+min+":"+sec);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
public class Fourth{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hour,min and sec- ");
        int hr = in.nextInt();
        int min = in.nextInt();
        int sec = in.nextInt();
        Time obj = new Time(hr,min,sec);
    }
}