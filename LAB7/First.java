// Aim of the program -Write a program to perform following operations on user entered strings and
// a character –
// i) Change the case of the string
// ii) Reverse the string
// iii) Compare two strings
// iv) Insert one string into another string
// v) Convert the string to upper case and lower case
// vi) Check whether the character is present in the string and at which position
// vii) Check whether the string is palindrome or not.
// viii) Check the number of word, vowel and consonant in the string
import java.util.Scanner;
public class First{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string - ");
        String str  =  in.nextLine();
          String str2 = in.nextLine();
        System.out.println("Enter choice");
        int c = in.nextInt();
        switch(c){
          case 1:
          str = str.toUpperCase();
          System.out.println(str);
          break;
          case 2:
          String revStr = new String();
          for(int i = 0;i<str.length();i++){
            revStr = str.charAt(i)+revStr;
          }
          System.out.println(revStr);
          break;
          case 3:
         System.out.println(str.compareTo(str2));
         break;
         case 4:
         System.out.println(str.concat(str2));
          break;

        }
    }
}